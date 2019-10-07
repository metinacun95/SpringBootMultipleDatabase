package com.metinacun.testmultipledatabase.service;

import com.metinacun.testmultipledatabase.model.mssql.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public Product create(Product product);
    public List<Product> getAll();
}
