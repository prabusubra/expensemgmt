package com.ps.alpha.expensemgmt.controllers;

import com.ps.alpha.expensemgmt.beans.Person;
import com.ps.alpha.expensemgmt.services.ports.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {"/user"})
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<Person>> getPersons(){
        return ResponseEntity.ok(userService.getPersons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") long id){
        return ResponseEntity.ok(userService.getPerson(id));
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person){
        return ResponseEntity.ok(userService.save(person));
    }

}
