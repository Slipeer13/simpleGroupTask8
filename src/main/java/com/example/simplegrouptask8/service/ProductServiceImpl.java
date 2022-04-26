package com.example.simplegrouptask8.service;


import com.example.simplegrouptask8.dao.ProductRepository;
import com.example.simplegrouptask8.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteByIdProduct(long id) {
        productRepository.deleteById(id);
    }


}
