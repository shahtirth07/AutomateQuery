package com.tirth.Day10.AutomateQuery.controller;

import com.tirth.Day10.AutomateQuery.entities.User;
import com.tirth.Day10.AutomateQuery.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Crud {
    @Autowired
    UserService service;

    @GetMapping("/User/{id}")
    public Object retrieve(@PathVariable("id") String id){
        User ref=service.getObject(id);
        return ref;
    }
    @PostMapping("/User/add")
    public String insert(){
        return "data added";
    }

    @DeleteMapping("User/{id}/delete")
    public String delete(){
        return null;
    }


}


