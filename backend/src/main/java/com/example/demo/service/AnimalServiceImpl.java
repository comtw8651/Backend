package com.example.demo.service;

import com.example.demo.entity.Animal;
import com.example.demo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal update(Animal animal) {
        return animalRepository.save(animal);  // save() 會自動根據 id 是更新還是新增
    }
}
