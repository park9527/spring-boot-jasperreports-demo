package com.itclj.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/detail/{userId}")
    public String detail(@PathVariable("userId") String userId) {
        return userId;
    }

}
