package com.example.demo.service;

import com.example.demo.entity.Animal;
import java.util.List;

public interface AnimalService {

    List<Animal> getAllAnimals();         // 查全部
    Animal addAnimal(Animal animal);      // 新增動物
    Animal update(Animal animal);         // 更新（移動後）
}