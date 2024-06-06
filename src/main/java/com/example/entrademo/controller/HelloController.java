package com.example.entrademo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.access.prepost.PreAuthorize;

@Controller
public class HelloController {

    @GetMapping("/home")
    public String home(Authentication authentication, Model model) {
        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("APPROLE_Admin"))) {
            model.addAttribute("message", "Welcome admin");
            return "admin-home";
        } else if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("APPROLE_User"))) {
            model.addAttribute("message", "Welcome user");
            return "user-home";
        } else {
            return "Welcome to the home page";
        }
    }

    @GetMapping("/add-appeal")
    @PreAuthorize("isAuthenticated()")
    public String addAppeal(Model model) {
        model.addAttribute("message", "Add appeal here");
        return "add-appeal";
    }

    @GetMapping("/verify-appeal")
    @PreAuthorize("hasAuthority('APPROLE_Admin')")
    public String verifyAppeal(Model model) {
        model.addAttribute("message", "Verify appeal here");
        return "verify-appeal";
    }
}
