package com.upc.equip.service;

/**
 * @Author: waiter
 * @Date: 2019/8/26 15:24
 * @Version 1.0
 */

public interface MessageService {
    /**
     * 接收到客户端消息的回调
     */
    void onReceive();
}
