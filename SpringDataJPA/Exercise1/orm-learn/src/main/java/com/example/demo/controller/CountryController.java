package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryRepository repo;

    public CountryController(CountryRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Country> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return repo.save(country);
    }

    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        repo.deleteById(code);
    }

    @PutMapping("/{code}")
    public Country updateCountry(@PathVariable String code,
            @RequestBody Country updatedCountry) {

        Country existing = repo.findById(code)
                .orElseThrow(() -> new RuntimeException("Country not found: " + code));

        existing.setName(updatedCountry.getName());

        return repo.save(existing);
    }
}