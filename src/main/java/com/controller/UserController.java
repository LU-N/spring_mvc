package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JinLu
 * @date 2019/10/22
 */
@Controller
public class UserController {
    @RequestMapping("/quick")
    public String save() {
        System.out.println("Controller save running");
        return "success.jsp";
    }
}
