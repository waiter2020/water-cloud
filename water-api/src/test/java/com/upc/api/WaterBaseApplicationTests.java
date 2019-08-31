package com.upc.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.upc.api.mapper.EquipMapper;
import com.upc.api.mapper.EquipParamMapper;
import com.upc.api.mapper.EquipStateMapper;
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
