package com.upc.security.service.impl;

import com.upc.security.bean.Role;
import com.upc.security.dao.RoleDao;
import com.upc.security.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author: waiter
 * @Date: 2019/8/31 22:58
 * @Version 1.0
 */
@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    @Override
    public Role getDefaultRole() {
        return roleDao.getOne(1);
    }
}
