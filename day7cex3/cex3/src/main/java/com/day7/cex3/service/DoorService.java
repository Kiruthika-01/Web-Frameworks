package com.day7.cex3.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7.cex3.model.Door;
import com.day7.cex3.repository.DoorRepo;

@Service
public class DoorService {
    @Autowired
    private DoorRepo rep;

    public boolean post(Door door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Door> getAll()
    {
        return rep.findAll();
    }

    public List<Door> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<Door> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
