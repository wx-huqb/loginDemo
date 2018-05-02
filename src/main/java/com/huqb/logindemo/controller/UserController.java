package com.huqb.logindemo.controller;

import com.huqb.logindemo.model.Person;
import com.huqb.logindemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("login/{id}")
    @ResponseBody
    public String getUserById(@PathVariable int id){

        Person person = userService.selectPersonById(id);

        return person.toString();
    }
}
