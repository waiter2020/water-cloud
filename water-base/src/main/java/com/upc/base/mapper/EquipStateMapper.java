package com.upc.base.mapper;

import com.upc.base.bean.EquipState;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: waiter
 * @Date: 2019/8/26 18:49
 * @Version 1.0
 */
@Mapper
public interface EquipStateMapper {
    List<EquipState> selectAll();
}
