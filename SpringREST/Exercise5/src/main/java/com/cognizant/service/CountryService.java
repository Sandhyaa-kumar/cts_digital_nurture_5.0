package main.java.com.cognizant.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;

@Service
public class CountryService {

    public Country getCountry(String code) {

        System.out.println("START - getCountry()");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        // Loop and find match (case-insensitive)
        for (Country country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                System.out.println("END - getCountry()");
                return country;
            }
        }

        System.out.println("END - getCountry()");
        return null;
    }
}