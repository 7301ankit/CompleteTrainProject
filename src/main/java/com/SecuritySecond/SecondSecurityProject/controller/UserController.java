package com.SecuritySecond.SecondSecurityProject.controller;

import com.SecuritySecond.SecondSecurityProject.model.User;
import com.SecuritySecond.SecondSecurityProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUserAll(){
        System.out.println("@@@@@@@@@@2  inside getUserAll ");
        return this.userService.getAllUser();
    }
    @GetMapping("/{username}")
    public User getByName(@PathVariable("username") String username){
        return this.userService.getUserByName(username);
    }
    @PostMapping("/user")
    public User createUser(User user){
        return this.userService.addUser(user);
    }

}
