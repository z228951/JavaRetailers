package com.miaosha.dao;

import com.miaosha.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/***
 *
 * 用户信息表
 * @author zhangwei
 * @Date  2018-06-19
 */
public interface UserDao {

    @Select("select * from miaosha_user where id = #{id}")
    User getById(@Param("id")long id);

    @Update("update miaosha_user set password = #{password} where id = #{id}")
   void update(User toBeUpdate);

}
