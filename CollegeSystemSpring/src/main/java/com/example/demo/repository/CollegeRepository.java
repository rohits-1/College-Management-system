package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.College;

public interface CollegeRepository extends JpaRepository<College,Integer> {

}
