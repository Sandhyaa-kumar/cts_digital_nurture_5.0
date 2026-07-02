package com.cognizant.springlearn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {

        System.out.println("START - getCountryIndia()");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country =
                (Country) context.getBean("country");

        System.out.println("END - getCountryIndia()");

        return country;
    }
}