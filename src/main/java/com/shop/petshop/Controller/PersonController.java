package com.shop.petshop.Controller;

import com.shop.petshop.Model.Person;
import com.shop.petshop.Service.PersonService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;
    private final BCryptPasswordEncoder encoder;

    public PersonController(PersonService personService,
                            BCryptPasswordEncoder encoder) {
        this.personService = personService;
        this.encoder = encoder;
    }

    @GetMapping("/person")
    public List<Person> getAllPerson() {
        return personService.findAll();
    }

}
