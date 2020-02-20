package com.example.controller;

import com.example.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    InfoMapper infoMapper;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> main() {

//            model.addAttribute("name", String.valueOf(infoMapper.findById(info.getId())));
            return new ResponseEntity(infoMapper.findById(1), HttpStatus.OK);
    }

}
