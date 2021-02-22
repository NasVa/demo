package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users-main")
    public String usersMain(Model model){
        Iterable<User> myUsers = userRepository.findAll();
        model.addAttribute("users", myUsers);

        return "users-main";
    }


}
