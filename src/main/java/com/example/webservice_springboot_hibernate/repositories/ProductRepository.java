package com.example.webservice_springboot_hibernate.repositories;

import com.example.webservice_springboot_hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
