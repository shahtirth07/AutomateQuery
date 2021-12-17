package com.tirth.Day10.AutomateQuery.services;


import com.tirth.Day10.AutomateQuery.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User getObject(String value){
        User ref= repository.findById(value).get();
        return ref;
    }

}
