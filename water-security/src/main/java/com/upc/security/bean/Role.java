package com.upc.security.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by  waiter on 18-6-18.
 * @author waiter
 *
 * 用户权限
 */
@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements GrantedAuthority, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;
    /**
     * 用户权限
     *
     */
    private String role;

    @Override
    public String getAuthority() {
        return role;
    }


}
