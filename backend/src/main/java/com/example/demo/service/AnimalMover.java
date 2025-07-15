package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Animal;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Random;

@Component
public class AnimalMover {

    @Autowired
    private AnimalService animalService;

    private Random rand = new Random();

    @Scheduled(fixedRate = 1000) // 每 1 秒執行一次
    public void moveAnimals() {
        List<Animal> animals = animalService.getAllAnimals();
        for (Animal animal : animals) {
            int dx = rand.nextInt(11) - 5; // -5 ~ +5
            int dy = rand.nextInt(11) - 5;
            animal.setX(animal.getX() + dx);
            animal.setY(animal.getY() + dy);
            animalService.update(animal);
        }
    }
}
