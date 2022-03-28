package com.shop.petshop.Service;

import com.shop.petshop.Model.Person;
import com.shop.petshop.Repository.PersonRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {
    private PersonRepo repo;

    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public Person findUserByName(String username) {
        return repo.findByUsername(username);
    }

    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return (List<Person>) repo.findAll();
    }

}
