package com.simplecrud.springcrud.controller;

import com.simplecrud.springcrud.entities.User;
import com.simplecrud.springcrud.repository.UserRepository;
import com.simplecrud.springcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/users")
    public User adduser(@RequestBody  User user){
        return userService.saveUser(user);
    }
}
