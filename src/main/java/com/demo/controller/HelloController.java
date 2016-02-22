package com.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * Created by Darcy on 2016/2/17.
 */
@Controller
public class HelloController {

    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome() {
        return "hello world!";
    }

    @RequestMapping("/mylogin")
    public String login() {
        return "/login";
        /*Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }
        if (principal instanceof Principal) {
            return ((Principal) principal).getName();
        }
        return String.valueOf(principal);*/
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}

