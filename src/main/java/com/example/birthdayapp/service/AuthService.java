package com.example.birthdayapp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean authenticate(String username, String password) {
        return "IshikaAgarwal".equals(username) && "SarthakLovesIshika".equals(password);
    }
}
