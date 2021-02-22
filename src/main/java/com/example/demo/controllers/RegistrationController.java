package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;
import java.util.Map;


@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String mainRegistration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object>
                                      model){
        user.setStatus(true);
        user.setActive(true);
        user.setRegDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        user.setLastLog(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        userRepository.save(user);
        return "redirect:/users-main";
    }
}

