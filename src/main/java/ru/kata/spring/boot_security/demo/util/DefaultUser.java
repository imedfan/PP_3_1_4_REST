package ru.kata.spring.boot_security.demo.util;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

// import ru.kata.spring.boot_security.demo.service.UserService;
import ru.kata.spring.boot_security.demo.model.*;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;
import ru.kata.spring.boot_security.demo.repository.UserRepository;


@Component
public class DefaultUser {
    
    // @Autowired 
    // private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @PostConstruct
    private void initialize(){


        Set<Role> roles1 = new HashSet<Role>();
        roles1.add(roleRepository.save(new Role("ROLE_ADMIN")));
        roles1.add(roleRepository.save(new Role("ROLE_USER")));

        Set<Role> roles2 = new HashSet<Role>();
        roles2.add(roleRepository.save(new Role("ROLE_USER")));



        User user1 = new User();
        user1.setName("Antonio");
        user1.setCar("Fiat");
        user1.setAge(32);
        user1.setUsername("admin");
        user1.setPassword("$2a$12$ednl0KoMCQ9IwvlP5mlFleh/ZGON3vDqfC5NTOMwd24xZgDC8Yu/2"); //admin
        user1.setRoles(roles1);
        userRepository.save(user1);

        User user2 = new User();
        user2.setName("Julia");
        user2.setCar("Volvo");
        user2.setAge(28);
        user2.setUsername("user");
        user2.setPassword("$2a$12$Nu2k/x6nNhwjO0wQm.dwROyIlZ3ucyPh38jbujLo/iMYufosyzRDG"); //user
        user2.setRoles(roles2);
        userRepository.save(user2);



    }


}

