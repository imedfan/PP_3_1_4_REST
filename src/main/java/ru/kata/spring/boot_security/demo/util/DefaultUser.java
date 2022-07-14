// package ru.kata.spring.boot_security.demo.util;

// import javax.annotation.PostConstruct;

// import org.springframework.beans.factory.annotation.Autowired;

// import org.springframework.stereotype.Component;

// import ru.kata.spring.boot_security.demo.service.UserService;
// import ru.kata.spring.boot_security.demo.repository.*;
// import ru.kata.spring.boot_security.demo.model.*;
// import ru.kata.spring.boot_security.demo.repository.RoleRepository;

// @Component
// public class DefaultUser {
    
//     @Autowired 
//     private UserService userService;

//     @Autowired
//     private UserRepository userRepository;

//     @Autowired
//     private RoleRepository roleRepository;

//     @PostConstruct
//     private void initialize(){
//         Role role1 = new Role("ROLE_ADMIN");
//         Role role2 = new Role("ROLE_USER");

        
//         roleService.saveRole(role2);


//         User user1 = new User();
//         user1.setAge(32);
//         user1.setName("Antonio");
//         user1.setCar("Fiat");
//         user1.setUsername("admin");
//         user1.setPassword("admin");

//         user1.addRole(role1);


//         User user2 = new User();
//         user2.setName("Julia");
//         user2.setCar("Volvo");
//         user2.setAge(28);
//         user2.setUsername("user");
//         user2.setPassword("user");
//         user2.addRole(role2);

//         userService.add(user1);
//         userService.add(user2);


//     }


// }

