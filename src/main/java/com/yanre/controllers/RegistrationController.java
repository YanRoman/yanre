package com.yanre.controllers;

import com.yanre.entities.User;
import com.yanre.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping("/registration")
    public String addUser(User user, Model model){
        if (!userService.saveUser(user)){
            model.addAttribute("message", "Пользователь с таким username уже существует");
            System.out.println("error");
            return "registration";
        }
        System.out.println("its okey");
        return "redirect:/login";
    }
}
