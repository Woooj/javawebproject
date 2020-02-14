package com.example.controller;

import com.example.mapper.InfoMapper;
import com.example.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @Autowired
    InfoMapper infoMapper;

    @GetMapping("/")
    @RequestMapping
    @ResponseBody
    public String greeting() {

            Info info = new Info();
            info.setInfo("Hello Adik");
            infoMapper.insert(info);
//            model.addAttribute("name", String.valueOf(infoMapper.findById(info.getId())));
            return String.valueOf(infoMapper.findAll());
    }



}
