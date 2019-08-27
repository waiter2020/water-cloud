package com.upc.base.mapper;

import com.upc.base.bean.Equip;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @Author: waiter
 * @Date: 2019/8/26 16:58
 * @Version 1.0
 */
@Mapper
public interface EquipMapper {

    List<Equip> selectAll();
    void insert(Equip equip);
}