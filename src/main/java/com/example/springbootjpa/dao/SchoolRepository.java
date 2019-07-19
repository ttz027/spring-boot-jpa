package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Schools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<Schools,Integer> {
}
