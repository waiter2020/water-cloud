package com.upc.security.controller;

import com.upc.security.bean.User;
import com.upc.security.service.RoleService;
import com.upc.security.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * @Author: waiter
 * @Date: 2019/9/1 0:23
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/add")
    public User addUser(User user){
        user.setAuthorities(Collections.singletonList(roleService.getDefaultRole()));
        user.setEnabled(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.addUser(user);
    }
}
