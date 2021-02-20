package com.ysu.graduate.controller;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("indexController")
public class indexController {

    @RequestMapping(value = "showIndex")
//    @ResponseBody @RestController=@Controller+@ResponseMapping=返回内容而非页面，返回页面只用一个@Controller
    public String showIndex() {
        return "index";
    }
}
