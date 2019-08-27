package com.upc.base.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: waiter
 * @Date: 2019/8/26 16:43
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EquipParam {
    /**
     * 与设备id相同
     */
    private String id;
    /**
     * 阈值类型
     */
    private Integer thresholdType;
    /**
     * 阈值大小
     */
    private Integer thresholdValue;
    /**
     * 检漏模式
     */
    private Integer model;
}
