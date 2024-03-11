package com.example.webservice_springboot_hibernate.repositories;

import com.example.webservice_springboot_hibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
