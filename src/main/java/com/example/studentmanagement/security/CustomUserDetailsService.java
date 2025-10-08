package com.example.studentmanagement.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("admin")
                .password("$2a$10$7e8i6xvVbQ7I9E5o5YdJCOZZm6WmXvEwl6ZBCz5uzswZbBlUjNw3i") // password: admin123
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}
