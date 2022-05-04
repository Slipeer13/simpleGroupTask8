package com.example.simplegrouptask8.service;

import com.example.simplegrouptask8.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    void deleteByIdProduct(long id);

    Product findByIdProduct(Long id);

}
