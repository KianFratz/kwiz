package com.fratzkian.Kwiz.service;

import com.fratzkian.Kwiz.model.User;
import com.fratzkian.Kwiz.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService (UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}
