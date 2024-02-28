package com.day7.cex1.service;

// import java.util.List;

// import org.springframework.stereotype.Service;

import com.day7.cex1.model.Person;
import com.day7.cex1.repository.PersonRepo;
// @Service
// public class PersonService {
//     private PersonRepo personRepo;

//     public PersonService(PersonRepo personRepo) {
//         this.personRepo = personRepo;
//     }
//     public Person postPerson(Person person)
//     {
//         return personRepo.save(person);
//     }
//     public List<Person> getAll()
//     {
//          return personRepo.findAll();
//     }
//     public List<Person> getbyAge(int age)
//     {
//         return personRepo.findByAge(age);
//     }
// }
    




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonService {
    @Autowired
    private PersonRepo rep;

    public boolean post(Person person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Person> getAll()
    {
        return rep.findAll();
    }

    public List<Person> getbyAge(int age)
    {
        return rep.findByAge(age);
    }
    
}
