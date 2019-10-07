package com.metinacun.testmultipledatabase.service;

import com.metinacun.testmultipledatabase.model.oracle.User;
import com.metinacun.testmultipledatabase.repository.oracle.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceManager implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
