package com.upc.api.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: waiter
 * @Date: 2019/8/26 16:39
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class Group implements Serializable {
    private Integer id;
    private String name;
    private String admin;

}
