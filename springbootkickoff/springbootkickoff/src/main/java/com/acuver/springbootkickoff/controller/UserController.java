package com.acuver.springbootkickoff.controller;


import com.acuver.springbootkickoff.dto.UserDto;
import com.acuver.springbootkickoff.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @PostMapping("/add")
    public UserDto addUser(@RequestBody UserDto user) {
        return service.saveUser(user);
    }

    @GetMapping("/all")
    public List<UserDto> getAllUsers() {
        return service.getUsers();
    }
}
