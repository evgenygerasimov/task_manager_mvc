package com.evgenygerasimov.spring.to_do.taskmanager2.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MvcConfigurer implements WebMvcConfigurer {
    @Override
        public void addViewControllers (ViewControllerRegistry registry){
//
//            registry.addViewController("/").setViewName("registration-or-sign-in");
//            registry.addViewController("/login").setViewName("login");
//            registry.addViewController("/addNewUser").setViewName("add-user");

    }
}