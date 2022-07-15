package ru.kata.spring.boot_security.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;
import ru.kata.spring.boot_security.demo.repository.UserRepository;

import java.util.*;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;



    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    public Set<Role> getAllRoles() {

        return new HashSet<>(roleRepository.findAll());

    }

    public void saveOrUpdate(User user, Set<Role> roles) {
        user.setRoles(roles);
        userRepository.save(user);
    }


    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findUserByUsername(username);
    }

    public User findUserById(Long id) {
        return userRepository.getById(id);
    }

    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}