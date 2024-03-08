package com.example.webservice_springboot_hibernate.repositories;

import com.example.webservice_springboot_hibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
