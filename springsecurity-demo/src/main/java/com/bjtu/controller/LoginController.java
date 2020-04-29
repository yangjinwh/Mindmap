package com.bjtu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login/fail")
    public String fail(Model model) {
        model.addAttribute("msg", "登录失败");
        return "login";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }
}
