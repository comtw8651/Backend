package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Animal;
import com.example.demo.service.AnimalService;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }
}