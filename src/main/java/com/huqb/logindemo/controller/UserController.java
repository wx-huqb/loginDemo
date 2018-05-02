package com.huqb.logindemo.controller;

import com.huqb.logindemo.model.Person;
import com.huqb.logindemo.result.ResultBack;
import com.huqb.logindemo.result.ResultImpl;
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
    public ResultBack getUserById(@PathVariable int id){

        Person person = userService.selectPersonById(id);
        if(null == person){
            return ResultImpl.error("400001","没有这个人",null);
        }else{
            return ResultImpl.success("200001","找到对应信息",person);
        }

    }
}
