package com.abhinendra.controllers;

import com.abhinendra.domain.Person;
import com.abhinendra.services.PersonService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/person")
@Api(tags = "/person", description = "Operations pertaining to person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Person getPersonById(@PathVariable("id") int id) throws Exception {
        return personService.findPersonById(id);
    }

    @GetMapping(value="/",produces="application/json")
    public Person findPersonByName(@RequestParam("name") String  name) throws Exception {
        System.out.println("Path param : "+name);
        return personService.findPersonByName(name);
    }

    @PostMapping(value = "/{name}",produces = "application/json")
    public Person savePerson(@PathVariable("name") String name) throws Exception {
         return personService.savePerson(name);
    }

}
