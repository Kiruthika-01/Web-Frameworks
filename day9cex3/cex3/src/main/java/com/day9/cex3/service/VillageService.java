package com.day9.cex3.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day9.cex3.model.Village;
import com.day9.cex3.repository.VillageRepo;

@Service
public class VillageService {
    @Autowired
    private VillageRepo rep;

    public boolean post(Village person)
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

    public Village start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public Village get3(int id)
    {
        return rep.findById(id);
    }

    public List<Village> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}

