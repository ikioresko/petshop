package com.shop.petshop.Repository;

import com.shop.petshop.Model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long> {
    Person findByUsername(String name);
}