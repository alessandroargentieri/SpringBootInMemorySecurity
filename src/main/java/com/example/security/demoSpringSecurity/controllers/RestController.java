package com.example.security.demoSpringSecurity.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/info")
    public String getInfo(){
        return "Spring security application: this is the only allowed request mapping";
    }

    /*
    * for ADMIN role users ONLY
    * */
    @RequestMapping("/objectives")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getObjectives(){
        return "Spring security application: this is the secured objectives request mapping";
    }

    /*
    * for USER role users
    * */
    @RequestMapping("/tasks")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String getTasks(){
        return "Spring security application: this is the secured tasks request mapping";
    }

}
