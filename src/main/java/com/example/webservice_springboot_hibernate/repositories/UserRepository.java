package com.example.webservice_springboot_hibernate.repositories;

import com.example.webservice_springboot_hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {}
