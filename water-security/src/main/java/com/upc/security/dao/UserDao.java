package com.upc.security.dao;

import com.upc.security.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: waiter
 * @Date: 2019/8/31 22:51
 * @Version 1.0
 */

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsernameOrEmailOrPhoneNumber(String username,String email,Long phoneNumber);
}
