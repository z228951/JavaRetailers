package com.miaosha.util;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/***
 *
 * 验证实体类属性字段
 * @author 张伟
 * @Date 2018-06-13
 */
@Getter
@Setter
@ToString
public class LoginVo {

    @NonNull
    private  String moblie;



}
