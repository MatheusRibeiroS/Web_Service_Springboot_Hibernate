package com.example.webservice_springboot_hibernate.services;

import com.example.webservice_springboot_hibernate.entities.Category;
import com.example.webservice_springboot_hibernate.entities.User;
import com.example.webservice_springboot_hibernate.repositories.CategoryRepository;
import com.example.webservice_springboot_hibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }
}
