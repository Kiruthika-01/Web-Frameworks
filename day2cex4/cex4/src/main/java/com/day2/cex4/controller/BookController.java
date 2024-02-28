package com.day2.cex4.controller;






import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.day2.cex4.model.Book;
@RestController
public class BookController {
    @GetMapping("/book")
    public Book getdetails(){
        Book b=new Book("The Great Soldier","G. Gyan",new Date());
        return b;
    }
}