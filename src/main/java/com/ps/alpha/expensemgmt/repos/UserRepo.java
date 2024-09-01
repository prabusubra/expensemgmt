package com.ps.alpha.expensemgmt.repos;

import com.ps.alpha.expensemgmt.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Person, Long> {

}
