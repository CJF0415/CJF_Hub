package com.fh.trace.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class HtmlController {
            @GetMapping("/templates")
        public String html(HttpServletRequest request) {
            //逻辑处理
            request.setAttribute("key", "hello world");
            return "/index2";
        }
}
