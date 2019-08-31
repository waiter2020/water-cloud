package com.upc.security.service.impl;

import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * @Author: waiter
 * @Date: 2019/8/31 22:53
 * @Version 1.0
 */
@Service("myClientDetailsService")
public class MyClientDetailsServiceImpl extends JdbcClientDetailsService {
    public MyClientDetailsServiceImpl(DataSource dataSource) {
        super(dataSource);
    }
}
