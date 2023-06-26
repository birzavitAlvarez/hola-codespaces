package com.example.holacodespaces.controller;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class Controller {

    @GetMapping(path ="/")
    public String home(){
        return "A20200702 - Birzavit Alvarez";
    }


}