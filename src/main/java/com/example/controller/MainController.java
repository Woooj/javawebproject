package com.example.controller;

import com.example.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    InfoMapper infoMapper;
// ищу только по id = 1, так как при запуске проекта срабатывает sql скрипт, который добавляет в бд 1 строчку "Hello World"
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> main() {
         return new ResponseEntity(infoMapper.findById(1), HttpStatus.OK);
    }

}
