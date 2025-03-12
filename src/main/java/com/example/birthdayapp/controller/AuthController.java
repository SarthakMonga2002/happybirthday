package com.example.birthdayapp.controller;

import com.example.birthdayapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/")
    public String home() {
        return "redirect:/auth/login"; // Redirects to the login page
    }

    // ✅ Login Page
    @GetMapping("/auth/login")
    public String showLoginPage() {
        return "login"; // Loads login.html from templates/
    }

    // ✅ Login Handling
    @PostMapping("/auth/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        boolean authenticated = authService.authenticate(username, password);
        if (authenticated) {
            return "redirect:/dashboard"; // Redirects to dashboard on success
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "login"; // Reloads login.html with an error
        }
    }

    // ✅ Dashboard Page
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Loads dashboard.html from templates/
    }

    // ✅ Storytime Page
    @GetMapping("/storytime")
    public String storyTimePage() {
        return "storytime"; // Loads storytime.html from templates/
    }

    // ✅ SweetMoments Page
    @GetMapping("/sweetmoments")
    public String sweetMomentsPage() {
        return "sweetmoments"; // Loads sweetMoments.html from templates/
    }

    // ✅ Questionnare Page
    @GetMapping("/questionnaire")
    public String questionnairePage() {
        return "questionnaire"; // Loads sweetMoments.html from templates/
    }

    @GetMapping("/piccollage")
    public String piccollagePage() {
        return "piccollage"; // Loads sweetMoments.html from templates/
    }
}
