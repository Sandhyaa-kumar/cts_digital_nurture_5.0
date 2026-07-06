package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoanDetails(@PathVariable String number) {

        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("type", "Car Loan");
        response.put("loanAmount", 500000);
        response.put("emi", 12000);
        response.put("tenure", 5);

        return response;
    }
}