package com.jwt.authdemo.controller;

import com.jwt.authdemo.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {

        String authHeader = request.getHeader("Authorization");

        String username = "";
        String password = "";

        if (authHeader != null && authHeader.startsWith("Basic ")) {

            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(decodedBytes);

            String[] values = credentials.split(":", 2);
            username = values[0];
            password = values[1];
        }

        // simple validation (you can change later)
        if ("user".equals(username) && "pwd".equals(password)) {
            String token = JwtUtil.generateToken(username);
            return "{\"token\":\"" + token + "\"}";
        } else {
            return "Invalid Credentials";
        }
    }
}