package com.example.backend.controller;

import com.example.backend.model.MyEntity;
import com.example.backend.service.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
public class MyEntityController {
    @Autowired
    private MyEntityService service;

    @PostMapping
    public MyEntity create(@RequestBody MyEntity entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public MyEntity update(@PathVariable Long id, @RequestBody MyEntity newEntityData) {
        return service.update(id, newEntityData);
    }

    @GetMapping
    public List<MyEntity> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public MyEntity findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
