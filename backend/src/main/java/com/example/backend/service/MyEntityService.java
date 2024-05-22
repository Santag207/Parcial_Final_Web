package com.example.backend.service;

import com.example.backend.model.MyEntity;
import com.example.backend.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyEntityService {
    @Autowired
    private MyEntityRepository repository;

    public MyEntity create(MyEntity entity) {
        return repository.save(entity);
    }

    public MyEntity update(Long id, MyEntity newEntityData) {
        MyEntity entity = repository.findById(id).orElseThrow();
        entity.setName(newEntityData.getName());
        return repository.save(entity);
    }

    public List<MyEntity> findAll() {
        return repository.findByDeletedFalse();
    }

    public MyEntity findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        MyEntity entity = repository.findById(id).orElseThrow();
        entity.deleteEntity();
        repository.save(entity);
    }
}
