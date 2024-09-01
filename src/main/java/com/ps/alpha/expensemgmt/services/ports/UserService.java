package com.ps.alpha.expensemgmt.services.ports;

import com.ps.alpha.expensemgmt.beans.Person;

import java.util.List;

public interface UserService {

    public List<Person> getPersons();

    public Person getPerson(long id);

    public Person save(Person person);
}
