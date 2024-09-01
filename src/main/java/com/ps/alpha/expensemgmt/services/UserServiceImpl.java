package com.ps.alpha.expensemgmt.services;

import com.ps.alpha.expensemgmt.beans.Person;
import com.ps.alpha.expensemgmt.repos.UserRepo;
import com.ps.alpha.expensemgmt.services.ports.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public Person getPerson(long id){
        return userRepo.findById(id).get();
    }

    public List<Person> getPersons(){
        return userRepo.findAll();
    }

    public Person save(Person person){
       return userRepo.save(person);
    }
}
