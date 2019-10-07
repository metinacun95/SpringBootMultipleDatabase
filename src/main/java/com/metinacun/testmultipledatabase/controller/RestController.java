package com.metinacun.testmultipledatabase.controller;

import com.metinacun.testmultipledatabase.model.oracle.User;
import com.metinacun.testmultipledatabase.model.mssql.Product;
import com.metinacun.testmultipledatabase.service.DataTransferServiceManager;
import com.metinacun.testmultipledatabase.service.ProductServiceManager;
import com.metinacun.testmultipledatabase.service.UserServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    UserServiceManager userServiceManager;

    @Autowired
    ProductServiceManager productServiceManager;

    @Autowired
    DataTransferServiceManager dataTransferServiceManager;

    @PostMapping("/create/user")
    public User createUser(@RequestBody  User user){
        return userServiceManager.create(user);
    }

    @GetMapping("/getAll/user")
    public List<User> getAllUser(){
        return  userServiceManager.getAll();
    }

    @PostMapping("/create/product")
    public Product createProduct(@RequestBody Product product){
        return productServiceManager.create(product);
    }

    @GetMapping("/getAll/product")
    public List<Product> getAllProduct(){
        return productServiceManager.getAll();
    }

    @GetMapping("/transfer")
    public String transfer(){
        return dataTransferServiceManager.transfer();
    }
}
