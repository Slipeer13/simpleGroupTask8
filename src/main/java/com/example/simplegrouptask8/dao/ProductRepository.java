package com.example.simplegrouptask8.dao;


import com.example.simplegrouptask8.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
