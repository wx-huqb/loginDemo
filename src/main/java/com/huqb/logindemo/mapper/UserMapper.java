package com.huqb.logindemo.mapper;

import com.huqb.logindemo.model.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from Person where id=#{id}")
    Person getUserById(Integer id);
}
