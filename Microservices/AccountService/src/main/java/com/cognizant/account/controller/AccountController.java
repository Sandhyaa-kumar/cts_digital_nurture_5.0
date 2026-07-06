package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Map<String, Object> getAccountDetails(@PathVariable String number) {

        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("name", "Sandhya");
        response.put("balance", 25000);

        return response;
    }
}