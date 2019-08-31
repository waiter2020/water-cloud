package com.upc.security.dao;

import com.upc.security.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: waiter
 * @Date: 2019/8/31 22:52
 * @Version 1.0
 */

public interface RoleDao extends JpaRepository<Role,Integer> {
}
