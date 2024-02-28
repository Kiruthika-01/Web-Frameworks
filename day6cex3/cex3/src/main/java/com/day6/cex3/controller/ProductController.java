package com.day6.cex3.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.day6.cex3.model.Product;
import com.day6.cex3.service.ProductService;
@RestController
public class ProductController {
    @Autowired
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService=productService;
    }
    @PostMapping("/api/product/add")
    public ResponseEntity<Product> create(@RequestBody Product obj)
    {
        return new ResponseEntity<>(productService.create(obj),HttpStatus.CREATED);
    }
    @GetMapping("/api/product")
    public ResponseEntity<List<Product>> getAll()
    {
        return new ResponseEntity<>(productService.getAll(),HttpStatus.OK);
    }
    @GetMapping("/api/product/{productId}")
    public ResponseEntity<Product> getById(@PathVariable int productId)
    {
        Product obj = productService.getById(productId);
            return new ResponseEntity<>(obj,HttpStatus.OK);
    }
}