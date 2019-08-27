package com.upc.equip.service.impl.usr;

import cn.usr.UsrCloudMqttCallbackAdapter;
import cn.usr.UsrCloudMqttClientAdapter;
import lombok.SneakyThrows;
import lombok.experimental.Delegate;
import lombok.extern.apachecommons.CommonsLog;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.nio.charset.StandardCharsets;

/**
 * @Author: waiter
 * @Date: 2019/8/26 14:48
 * @Version 1.0
 * 透传云的客户端
 */
@CommonsLog
@Service
public class MyUsrClient extends UsrCloudMqttCallbackAdapter {
    /**
     * 取配置文件中的用户名
     */
    @Value("${usr.username}")
    private String username;
    /**
     * 取配置文件中的密码
     */
    @Value("${usr.password}")
    private String password;

    @Delegate
    private final UsrCloudMqttClientAdapter clientAdapter = new UsrCloudMqttClientAdapter();

    /**
     * 初始化方法
     */
    @PostConstruct
    @SneakyThrows
    public void init() {
        log.info("透传云客户端正在初始化");
        this.setUsrCloudMqttCallback(this);
        this.Connect(username,password);
        log.info("正在连接透传云----账号："+username);
    }

    @PreDestroy
    @SneakyThrows
    public void logout()  {
        log.info("断开与透传云的连接");
        this.DisConnectUnCheck();
    }

    @Override
    @SneakyThrows
    public void onConnectAck(int returnCode, String description) {
        log.info("透传云连接状态改变:"+description+"  状态码："+returnCode);
        if (returnCode == 2){
            this.SubscribeForUsername();
        }
    }

    @Override
    public void onSubscribeAck(int messageId, String clientId, String topics, int returnCode) {
        log.info("订阅消息:"+"消息ID:" + messageId + "----->" + "订阅用户:" + clientId + "----->" + "订阅主题:" + topics + "----->" + "状态码：" + returnCode);
    }

    @Override
    public void onDisSubscribeAck(int messageId, String clientId, String topics, int returnCode) {
        log.info("取消订阅消息:"+"消息ID:" + messageId + "----->" + "订阅用户:" + clientId + "----->" + "订阅主题:" + topics + "----->" + "状态码：" + returnCode);
    }

    @Override
    public void onReceiveEvent(int messageId, String topic, byte[] data) {
        log.info("收到消息"+new String(data, StandardCharsets.UTF_8));
    }



}
