package com.day4.cwex3.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.day4.cwex3.model.Product;
import com.day4.cwex3.repository.ProductRepo;
@Service
public class ProductService {
    @Autowired
    private ProductRepo rep;

    public boolean add(Product pro)
    {
        try{
            rep.save(pro);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public List<Product> find()
    {
        return rep.findAll();
    }
    public Optional<Product> findId(int id)
    {
        return rep.findById(id);
    }
}
