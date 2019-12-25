package com.fh.trace.controller;

import com.fh.trace.dao.entity.User;
import com.fh.trace.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
     * 测试控制器
     *
     */
//@Controller
    @RestController
    @Slf4j
    public class HelloController {

    @Autowired
    private UserService userService;
        @GetMapping("/queryAllUsers")
        public List<User> queryAllUsers(){
            log.info("get");
            return userService.queryAllUsers();
        }
    }
