package com.metinacun.testmultipledatabase.service;

import com.metinacun.testmultipledatabase.model.oracle.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User create(User user);
    public List<User> getAll();
}
