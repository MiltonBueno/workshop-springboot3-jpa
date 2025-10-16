package com.aulaspring.workshop_springboot3_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.workshop_springboot3_jpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
