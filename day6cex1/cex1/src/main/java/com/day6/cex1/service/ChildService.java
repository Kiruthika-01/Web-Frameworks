package com.day6.cex1.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.cex1.model.Children;
import com.day6.cex1.repository.ChildRepo;

@Service
public class ChildService {
    private ChildRepo childRepo;

    public ChildService(ChildRepo childRepo) {
        this.childRepo = childRepo;
    }
    public Children postChildren(Children children)
    {
        return childRepo.save(children);
    }
    public List<Children> getChildrens(String field)
    {
        return childRepo.findAll(Sort.by(field));
    }
    
    public Page<Children> childpagination(int offset,int pagesize)
    {
        return childRepo.findAll(PageRequest.of(offset, pagesize));
    }
    public Page<Children> childsortpage(int offset, int pagesize, String field) {
        PageRequest pageRequest = PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field));
        // Page<Children> page=childRepo.findAll(pageRequest);
        return childRepo.findAll(pageRequest);
    }
    
}
