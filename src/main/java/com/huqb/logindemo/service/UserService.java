package com.huqb.logindemo.service;

import com.huqb.logindemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;


public interface UserService {

    @Autowired
    public Person selectPersonById(Integer id);

}
