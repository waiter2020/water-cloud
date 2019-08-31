package com.upc.security.service.impl;

import com.upc.security.bean.User;
import com.upc.security.dao.UserDao;
import com.upc.security.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author: waiter
 * @Date: 2019/8/31 22:56
 * @Version 1.0
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        long phone;
        try {
            phone = Long.parseLong(s);
        } catch (Exception ignore) {
            phone = 0L;
        }
        User user = userDao.findByUsernameOrEmailOrPhoneNumber(s, s, phone);
        if (user == null) {
            throw new UsernameNotFoundException("用户名或邮箱错误");
        }
        return user;
    }
}
