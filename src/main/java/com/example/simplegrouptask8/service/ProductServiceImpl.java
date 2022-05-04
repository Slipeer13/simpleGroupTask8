package com.example.simplegrouptask8.service;


import com.example.simplegrouptask8.dao.ProductRepository;
import com.example.simplegrouptask8.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    @Override
    public Product findByIdProduct(Long id) {
        Product product = null;
        Optional<Product> optional = productRepository.findById(id);
        if(optional.isPresent()) {
            product = optional.get();
        }
        return product;
    }


}
