package com.day6.cex3.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day6.cex3.model.Product;
import com.day6.cex3.repository.ProductRepo;
@Service
public class ProductService {
    @Autowired
    private final ProductRepo pr;
    public ProductService(ProductRepo pr) {
        this.pr = pr;
    }
    public Product create(Product obj)
    {
        return pr.save(obj);
    }
    public List<Product> getAll()
    {
        return pr.findAll();
    }
    public Product getById(int id)
    {
        return pr.findById(id).orElse(null);
    }
}
