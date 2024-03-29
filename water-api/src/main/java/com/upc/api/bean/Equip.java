package com.upc.api.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * @Author: waiter
 * @Date: 2019/8/26 15:55
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("equip")
public class Equip implements Serializable {
    /**
     * 编号
     */
    @NonNull
    @TableId
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 地址/位置
     */
    private Address address;
    /**
     * 所属组
     */
    private Integer groupId;
}
