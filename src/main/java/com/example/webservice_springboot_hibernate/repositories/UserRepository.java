package com.example.webservice_springboot_hibernate.repositories;

import com.example.webservice_springboot_hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {}
