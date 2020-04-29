package com.bjtu.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    @RequestMapping("/list")
    public String list() {
        return "user_list";
    }

}
