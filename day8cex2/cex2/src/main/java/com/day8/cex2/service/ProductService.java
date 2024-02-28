package com.day8.cex2.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day8.cex2.model.Product;
import com.day8.cex2.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(Product person)
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

    public List<Product> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<Product> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<Product> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
