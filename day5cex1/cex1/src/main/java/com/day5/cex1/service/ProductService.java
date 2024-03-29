package com.day5.cex1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.cex1.model.Product;
import com.day5.cex1.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo rep;

    public boolean add(Product pro) {
        try {
            rep.save(pro);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Product getByIdToDelete(int userName) {
        return rep.findById(userName).orElse(null);
        
    }

    public Product update(int userName, Product signUp) {
        Product product = getByIdToDelete(userName);
        if (product==null) {
            return null;
        }
        try {
            rep.save(signUp);
            return product;
        } catch (Exception e) {
            return null;
        }
    }

    public Product deleteByName(int userName) {
        Product product = getByIdToDelete(userName);
        if (product==null) {
            return null;
        }
        rep.deleteById(userName);
        return product;
    }

}
