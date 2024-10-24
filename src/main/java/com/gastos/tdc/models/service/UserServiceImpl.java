package com.gastos.tdc.models.service;

import com.gastos.tdc.models.entity.AppUser;
import com.gastos.tdc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AppUser saveUser(AppUser user) {
        return userRepository.save(user);
    }

    @Override
    public List<AppUser> getAllUsers() {
        List<AppUser> response = new ArrayList<>();
        userRepository.findAll().forEach(response::add);
        return response;
    }
}
