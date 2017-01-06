package com.wyc.controller;

import com.wyc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yc on 2017/1/6.
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/loginConfirm",method = RequestMethod.GET)
    public String LoginConfirm(@RequestParam(name = "firstName" ,required = true) String firstName){
        int result=customerService.loginConfirm(firstName);
        if(result==1){
            return "success";
        }
        return "error";
    }

}
