package com.dubbo.consumer1.service;

/**
 * @author : ljl
 * @date : 2019/9/19
 */

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.entity.User;
import com.dubbo.service.UserService;
import org.springframework.stereotype.Service;

@Service                                //spring的Service注解
public class HelloService  {
    @Reference                          //这里是dubbo的注解
    UserService userService;

    public String login(User u){
        return userService.getName(u);
    }
}

