package com.example.SpringJsonExercises;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyFirstJsonAPI {

    @GetMapping("/json-object")
    public Person jsonObject(){
        Person person = new Person();
        person.setFirstName("Thirumalai Raju");
        person.setLastName("Rangarajan");
        return person;
    }

    @GetMapping("/json-array")
    public List<Person> jsonArrayObject(){
        Person person = new Person();
        person.setFirstName("Thirumalai Raju");
        person.setLastName("Rangarajan");
        person.setDOB("2016-02-11");
        person.setPetName("Raju");
        Person person1 = new Person();
        person1.setFirstName("Surya");
        person1.setLastName("Kuppan");
        person1.setDOB("1986-08-27");
        person1.setPetName("Amu");
        Person person2 = new Person();
        person2.setFirstName("Rangarajan");
        person2.setLastName("Murugan");
        person2.setPetName("Puppy");
        person2.setDOB("1986-10-24");
        return Arrays.asList(person,person1,person2);
    }
}
