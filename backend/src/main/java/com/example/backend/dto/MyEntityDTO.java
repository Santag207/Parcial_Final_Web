package com.example.backend.dto;

public class MyEntityDTO {
    private Long id;
    private String name;

    // Constructor vacío
    public MyEntityDTO() {}

    // Constructor con parámetros
    public MyEntityDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyEntityDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
