package com.aulaspring.workshop_springboot3_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.workshop_springboot3_jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
