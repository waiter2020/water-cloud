package com.upc.base;

import com.upc.base.bean.Address;
import com.upc.base.bean.Equip;
import com.upc.base.mapper.EquipMapper;
import com.upc.base.mapper.EquipParamMapper;
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

    @Test
    public void contextLoads() {
        System.out.println(equipParamMapper.selectAll());

    }

}
