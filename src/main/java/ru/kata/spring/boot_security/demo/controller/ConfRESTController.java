package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ru.kata.spring.boot_security.demo.model.User;
// import ru.kata.spring.boot_security.demo.repository.UserRepository;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;
import java.util.List;

@RestController

public class ConfRESTController {

    @Autowired
    private UserService userService;
    // // @Autowired
    // private UserRepository userRepository;


    @GetMapping("/api/user")
    public ResponseEntity<User> getUserByUsername(Principal principal) {
        ResponseEntity<User> user = ResponseEntity.ok(userService.findUserByUsername(principal.getName()));
        return user;
    }


    @GetMapping("/api/admin")
    public ResponseEntity<List<User>> userList() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/api/admin")
    public ResponseEntity<List<User>> addUser(@RequestBody User user) {
        userService.saveOrUpdate(user, user.getRoles());
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PutMapping("/api/admin")
    public ResponseEntity<List<User>> updateUser(@RequestBody User user) {
        userService.saveOrUpdate(user, user.getRoles());
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/api/admin/{id}")
    public ResponseEntity<User> showUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @DeleteMapping("/api/admin/{id}")
    public ResponseEntity<List<User>> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok(userService.getAllUsers());
    }
}