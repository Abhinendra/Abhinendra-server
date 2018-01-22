//package com.abhinendra.repositories;
//
//import com.abhinendra.domain.Person;
//import com.abhinendra.domain.QPerson;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.querydsl.QueryDslPredicateExecutor;
//import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface PersonRepository extends CrudRepository<PersonRepository, Integer>, QueryDslPredicateExecutor<Person>, QuerydslBinderCustomizer<QPerson> {
//    public Person save(Person person);
//}
