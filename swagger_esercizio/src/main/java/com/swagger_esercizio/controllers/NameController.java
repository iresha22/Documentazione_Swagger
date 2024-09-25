package com.swagger_esercizio.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {
    @PostMapping("/newname")
    public String addName(@RequestParam(required = true) String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        return stringBuilder.reverse().toString();
    }

    // per restituire il nome passato in Postmapping
    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return name;
    }
}
