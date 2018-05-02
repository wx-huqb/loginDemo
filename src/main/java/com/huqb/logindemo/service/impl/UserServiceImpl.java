package com.huqb.logindemo.service.impl;

import com.huqb.logindemo.mapper.UserMapper;
import com.huqb.logindemo.model.Person;
import com.huqb.logindemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Person selectPersonById(Integer id) {

        Person person = userMapper.getUserById(id);

        return person;

    }
}
