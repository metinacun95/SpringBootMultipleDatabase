package com.metinacun.testmultipledatabase.service;

import com.metinacun.testmultipledatabase.model.mssql.Product;
import com.metinacun.testmultipledatabase.model.oracle.OracleProduct;
import com.metinacun.testmultipledatabase.repository.mssql.ProductRepository;
import com.metinacun.testmultipledatabase.repository.oracle.OracleProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTransferServiceManager implements DataTransferService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OracleProductRepository oracleProductRepository;

    @Override
    public String transfer() {
        List<Product> productList = productRepository.findAll();
        for (Product product: productList) {
            OracleProduct oracleProduct = new OracleProduct();
            oracleProduct.setId(product.getId());
            oracleProduct.setName(product.getName());
            oracleProduct.setPrice(product.getPrice());
            oracleProductRepository.save(oracleProduct);
        }
        return "Success";
    }
}
