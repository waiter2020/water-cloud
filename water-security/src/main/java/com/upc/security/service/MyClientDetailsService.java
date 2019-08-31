package com.upc.security.service;

import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * @Author: waiter
 * @Date: 2019/8/29 23:42
 * @Version 1.0
 */

public interface MyClientDetailsService extends ClientDetailsService, ClientRegistrationService {

}
