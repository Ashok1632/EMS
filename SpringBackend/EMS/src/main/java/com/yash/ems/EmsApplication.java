package com.yash.ems;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.yash.ems.exception.UserFoundException;
import com.yash.ems.model.Role;
import com.yash.ems.model.User;
import com.yash.ems.model.UserRole;
import com.yash.ems.service.UserService;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class EmsApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

   
    public static void main(String[] args) {


        SpringApplication.run(EmsApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        try {


            System.out.println("starting code");
//
            User user = new User();

            user.setFirstName("ashok");
            user.setLastName("panhalkar");
            user.setUsername("ashok@22");
            user.setPassword(this.bCryptPasswordEncoder.encode("1234"));
            user.setEmail("abc@gmail.com");
            user.setProfile("default.png");

            Role role1 = new Role();
            role1.setRoleId(44L);
            role1.setRoleName("ADMIN");

            Set<UserRole> userRoleSet = new HashSet<>();
            UserRole userRole = new UserRole();

            userRole.setRole(role1);

            userRole.setUser(user);

            userRoleSet.add(userRole);

            User user1 = this.userService.createUser(user, userRoleSet);
            System.out.println(user1.getUsername());


        } catch (UserFoundException e) {
            e.printStackTrace();


        }


    }


}
