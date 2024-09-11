package com.example.auth_application.controller;

import com.example.auth_application.dto.request.user.SigninRequest;
import com.example.auth_application.dto.response.user.SigninResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import com.example.auth_application.utils.JwtUtil;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping("/signin")
    public SigninResponse signin(@RequestBody SigninRequest authenticationRequest) throws Exception {

        return SigninResponse.builder().token(jwtUtil.generateToken("x")).build();
    }

    @GetMapping("/hello")
    public String sayHello() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = (String) authentication.getPrincipal();
        String id = (String) authentication.getDetails();  // Get the ID from the authentication details

        return "Hello " + username + " with ID: " + id;
    }
    @GetMapping("/user-info")
    public String getUserInfo(@RequestHeader("Authorization") String token) {
        return "User information is retrieved successfully!";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "API is running!";
    }
}
