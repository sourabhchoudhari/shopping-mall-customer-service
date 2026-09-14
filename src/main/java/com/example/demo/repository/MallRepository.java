package com.example.demo.repository;

import com.example.demo.entity.Mall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MallRepository extends JpaRepository<Mall, Long> {

}