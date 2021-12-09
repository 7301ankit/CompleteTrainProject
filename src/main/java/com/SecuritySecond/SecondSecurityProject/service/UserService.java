package com.SecuritySecond.SecondSecurityProject.service;

import com.SecuritySecond.SecondSecurityProject.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> list=new ArrayList<>();

    public UserService(){

        list.add(new User("Ankit","ankitbainsla@gmail.com","ankit123"));
        list.add(new User("lalit","lalitkumar@gmail.com","lalit123"));

    }
    // get all user
    public List<User> getAllUser(){
        return this.list;
    }
    //get single user
    public User getUserByName(String username){
        return this.list.stream().filter((user)-> user.getUsername().equals(username)).findAny().orElse(null);
    }
    public User addUser(User user){
       this.list.add(user);
        return user;
    }

}
