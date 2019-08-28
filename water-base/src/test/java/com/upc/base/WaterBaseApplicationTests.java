package com.upc.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.upc.base.bean.Address;
import com.upc.base.bean.Equip;
import com.upc.base.bean.EquipState;
import com.upc.base.mapper.EquipMapper;
import com.upc.base.mapper.EquipParamMapper;
import com.upc.base.mapper.EquipStateMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WaterBaseApplicationTests {

    @Autowired
    private EquipMapper mapper;

    @Autowired
    private EquipParamMapper equipParamMapper;

    @Autowired
    private EquipStateMapper equipStateMapper;

    @Test
    public void contextLoads() {
        System.out.println(equipStateMapper.selectList(new QueryWrapper<>()));

    }

}
