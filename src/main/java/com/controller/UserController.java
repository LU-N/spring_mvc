package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author JinLu
 * @date 2019/10/22
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping(value = "/quick", params = {"username"})
    public String save() {
        System.out.println("Controller save running");
        return "success";
    }
}
