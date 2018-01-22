package com.abhinendra.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated person ID")
    private int id;

    @Column(name="Name")
    @ApiModelProperty(notes = "The name of  person", required = true)
    private String name;

    public  Person(){
    }
    public Person(String name){
        this.name=name;
    }
}




