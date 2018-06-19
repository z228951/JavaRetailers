package com.miaosha.entity;


import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/***
 *
 * 用户表
 * @author 张伟
 * @Date 2018-06-15
 *
 */
@Getter
@Setter
@ToString
public class User implements Serializable  {

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     * 用户Id
     */
    private int id;
    /***
     * 登录账号
     */
    private String name;

}
