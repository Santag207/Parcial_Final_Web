package com.example.backend.repository;

import com.example.backend.model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
    List<MyEntity> findByDeletedFalse();
}
