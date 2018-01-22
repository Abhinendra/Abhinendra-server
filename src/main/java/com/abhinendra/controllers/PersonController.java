package com.abhinendra.controllers;

import com.abhinendra.domain.Person;
import com.abhinendra.services.PersonService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@Api(tags = "/person", description = "Operations pertaining to person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Person getPersonById(@PathVariable("id") int id) throws Exception {
        System.out.println("Could hit this controller");
        return personService.findPersonById(id);
    }

}
