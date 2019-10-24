package com.controller;

import com.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author JinLu
 * @date 2019/10/22
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/quick10")
    /**告知SpringMVC框架，不进行视图跳转，直接进行数据相应*/
    @ResponseBody
    public User save10() throws IOException {
        User user = new User();
        user.setUsername("nick");
        user.setAge(21);
        return user;
    }

    @RequestMapping(value = "/quick9")
    /**告知SpringMVC框架，不进行视图跳转，直接进行数据相应*/
    @ResponseBody
    public String save9() throws IOException {
        User user = new User();
        user.setUsername("nick");
        user.setAge(20);
        //使用jackson转换工具将对象转换成josn格式字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);

        return s;
    }

    @RequestMapping(value = "/quick8")
    /**告知SpringMVC框架，不进行视图跳转，直接进行数据相应*/
    @ResponseBody
    public String save8() {
        return "{\"username\" : \"justin\", \"age\" : 13}";
    }

    @RequestMapping(value = "/quick7")
    /**告知SpringMVC框架，不进行视图跳转，直接进行数据相应*/
    @ResponseBody
    public String save7() {
        return "hello";
    }

    @RequestMapping(value = "/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("aution");
    }

    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "小王");
        return "success";
    }

    @RequestMapping(value = "/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "小明");
        return "success";
    }

    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        modelAndView.addObject("username", "justin");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick2")
    public ModelAndView save2() {
        /*
            Model:模型 作用封装数据
            View：视图 作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", "itcast");
        //设置视图名称
        modelAndView.setViewName("success");

        return modelAndView;
    }


    @GetMapping(value = "/quick", params = {"username"})
    public String save() {
        System.out.println("Controller save running");
        return "success";
    }
}
