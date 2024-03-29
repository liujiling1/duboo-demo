package com.dubbo.consumer1.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.common.util.StringUtil;
import com.dubbo.consumer1.service.HelloService;
import com.dubbo.entity.User;
import com.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ljl
 * @date : 2019/9/19
 */
@RestController
public class TestController {

    @Autowired
    HelloService helloService;


    @RequestMapping("/hello")
    public String test(){
//        String s = "stss";
//        System.out.println("-----66-"+StringUtil.isEmpty(s));

        User user = new User();
        user.setId("c1");
        user.setName("c1-name");
        System.out.println(helloService.login(user));

        return "hello"+helloService.login(user);
    }


}
