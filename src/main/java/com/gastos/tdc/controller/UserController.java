package com.gastos.tdc.controller;

import com.gastos.tdc.models.entity.AppUser;
import com.gastos.tdc.models.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list-all")
    public ResponseEntity<List<AppUser>> getAllUsers() {
        List<AppUser> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/add")
    public ResponseEntity<AppUser> addNewUser(@RequestBody AppUser user) {
        AppUser newUser = userService.saveUser(user);
        return ResponseEntity.ok(newUser);
    }
}
