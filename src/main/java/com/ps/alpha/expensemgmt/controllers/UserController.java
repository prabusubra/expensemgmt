package com.ps.alpha.expensemgmt.controllers;

import com.ps.alpha.expensemgmt.beans.Person;
import com.ps.alpha.expensemgmt.services.ports.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public ResponseEntity<List<Person>> getPersons(){

    }

    public ResponseEntity<Person> getPerson(){

    }

    public ResponseEntity<Person> save(@RequestBody Person person){

    }

}
