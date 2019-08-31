package com.upc.security.service;


import com.upc.security.bean.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @Author: waiter
 * @Date: 2019/8/31 22:56
 * @Version 1.0
 */

public interface UserService extends UserDetailsService {
    User addUser(User user);
}
