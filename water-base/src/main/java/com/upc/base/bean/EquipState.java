package com.upc.base.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: waiter
 * @Date: 2019/8/26 16:42
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EquipState {
    /**
     * 与设备id相同
     */
    private String id;
    /**
     * 阈门开关
     */
    private Boolean isOpen;
    /**
     * 是否在线
     */
    private Boolean online;
    /**
     * 用水总量
     */
    private Double waterUsage;
    /**
     * 当前状态
     */
    private Integer equipState;
    /**
     * 是否低电量
     */
    private Boolean powerLow;
}
