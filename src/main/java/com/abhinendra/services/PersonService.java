package com.abhinendra.services;

import com.abhinendra.domain.Person;

public interface PersonService {
    public Person findPersonById(int id) throws Exception;

    public Person findPersonByName(String name) throws Exception;

    public Person savePerson(String name) throws Exception;
    public void deletePersonById(int id);

    public void deletePersonByName(String name);
}
