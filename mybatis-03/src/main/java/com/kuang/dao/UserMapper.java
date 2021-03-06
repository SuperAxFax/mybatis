package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select *from user")
    List<User> getUsers();

    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id,@Param("name") String name);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name = #{name},pwd = #{pwd} where id = #{id}")
    int update( User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);

}
