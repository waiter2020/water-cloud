package com.upc.base.mapper;

import com.upc.base.bean.EquipParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: waiter
 * @Date: 2019/8/26 18:37
 * @Version 1.0
 */

@Mapper
public interface EquipParamMapper {
    List<EquipParam> selectAll();
}
