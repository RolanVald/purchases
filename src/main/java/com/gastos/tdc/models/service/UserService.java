package com.gastos.tdc.models.service;

import com.gastos.tdc.models.entity.AppUser;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    List<AppUser> getAllUsers();
}
