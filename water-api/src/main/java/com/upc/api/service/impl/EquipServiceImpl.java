package com.upc.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.upc.api.bean.Equip;
import com.upc.api.mapper.EquipMapper;
import com.upc.api.service.EquipService;
import org.springframework.stereotype.Service;

/**
 * @Author: waiter
 * @Date: 2019/8/27 17:54
 * @Version 1.0
 */
@Service
public class EquipServiceImpl extends ServiceImpl<EquipMapper,Equip> implements EquipService {
}
