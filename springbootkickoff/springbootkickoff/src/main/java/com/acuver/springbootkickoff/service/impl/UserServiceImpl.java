package com.acuver.springbootkickoff.service.impl;

import com.acuver.springbootkickoff.dto.UserDto;
import com.acuver.springbootkickoff.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public UserDto saveUser(UserDto user) {
        return userRepository.save(user);
    }

    public List<UserDto> getUsers() {
        return userRepository.findAll();
    }
}



