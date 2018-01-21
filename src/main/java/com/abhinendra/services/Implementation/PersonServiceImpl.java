package com.abhinendra.services.Implementation;

import com.abhinendra.domain.Person;
import com.abhinendra.domain.QPerson;
import com.abhinendra.repositories.PersonRepository;
import com.abhinendra.services.PersonService;
import com.querydsl.core.types.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    Predicate predicate;
    @Autowired
    PersonRepository personRepository;
    
//    public PersonServiceImpl(PersonRepository personRepository){
//              this.personRepository =personRepository;
//    }
    
    @Override
    public Person findPersonById(int id) throws Exception {
        if(id<1){
            throw new Exception(" Only positive real numbers are allowed for id") ;
        }
        predicate= QPerson.person.id.eq(id);
        return personRepository.findOne(predicate);
    }

    @Override
    public Person findPersonByName(String name) throws Exception {
        if(StringUtils.isEmpty(name)){
            throw new Exception("Name can't be null");
        }
        predicate=QPerson.person.name.equalsIgnoreCase(name);
        return personRepository.findOne(predicate);
    }

    @Override
    public Person savePerson(String name) throws Exception {
       if( StringUtils.isEmpty(name) ){
           throw new Exception("Name can't be blank");
       }
       Person person=new Person(name);
       return personRepository.save(person);
    }

    @Override
    public void deletePersonById(int id) {

    }

    @Override
    public void deletePersonByName(String name) {

    }
}
