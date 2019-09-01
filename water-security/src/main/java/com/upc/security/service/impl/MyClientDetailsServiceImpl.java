package com.upc.security.service.impl;

import com.upc.security.bean.Role;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.config.annotation.builders.ClientDetailsServiceBuilder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @Author: waiter
 * @Date: 2019/8/31 22:53
 * @Version 1.0
 */
@CommonsLog
public class MyClientDetailsServiceImpl extends JdbcClientDetailsService {
    public MyClientDetailsServiceImpl(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws InvalidClientException {
        return super.loadClientByClientId(clientId);
    }


    public void init(){
        log.info("初始化客户端");
        BaseClientDetails clientDetails = new BaseClientDetails();
        clientDetails.setClientId("123456789");
        clientDetails.setAccessTokenValiditySeconds(3600);
        clientDetails.setClientSecret("123456789");
        clientDetails.setScope(Collections.singleton("all"));
        clientDetails.setAuthorizedGrantTypes(Arrays.asList("password","authorization_code"," refresh_token"));
        clientDetails.setAuthorities(Collections.singletonList(new SimpleGrantedAuthority("ROLE_CLIENT")));
        HashSet<String> strings = new HashSet<>();
        strings.add("http://127.0.0.1:8867/hello");
        clientDetails.setRegisteredRedirectUri(strings);
        clientDetails.setResourceIds(Collections.singleton("res1"));
        addClientDetails(clientDetails);
    }
}
