package com.upc.base.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: waiter
 * @Date: 2019/8/26 16:33
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address implements Serializable {
    /**
     * 经度
     */
    private Double longitude;
    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 文字地址
     */
    private String name;
}
