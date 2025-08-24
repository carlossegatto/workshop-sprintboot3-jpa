package com.cadu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
