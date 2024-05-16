package com.isaac.crudeapp.rest.controllers;

import com.isaac.crudeapp.rest.Repo.UserRepo;
import com.isaac.crudeapp.rest.controllers.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/") // the forward slash is the default endpoint that gets hit when accessing an endpoint
    public String getPage(){
        return "Welcome";
    }
    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return (List<User>) userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved";
    }
}
