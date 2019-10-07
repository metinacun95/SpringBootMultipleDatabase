package com.metinacun.testmultipledatabase.service;

import com.metinacun.testmultipledatabase.model.mssql.Product;
import com.metinacun.testmultipledatabase.repository.mssql.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceManager implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
