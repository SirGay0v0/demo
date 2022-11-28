package com.example.demo.controller;

import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    MyService service;


    @Autowired
    public MyController(MyService service) {
        this.service = service;
    }


    @GetMapping("count/")
    // @RequestMapping(name = "", method = RequestMethod.GET)
    public String  myString() {
        return service.string();
    }
}
