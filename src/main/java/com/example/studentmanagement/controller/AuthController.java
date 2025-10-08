package com.example.studentmanagement.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String username, @RequestParam String password) {
        Map<String, String> map = new HashMap<>();
        if ("admin".equals(username) && "admin123".equals(password)) {
            map.put("token", "dummy-token"); 
        } else {
            map.put("error", "Invalid credentials");
        }
        return map;
    }
}
