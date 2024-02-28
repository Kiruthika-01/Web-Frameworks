package com.bookreview.review.model;

// public class ReviewDetails {
    
// }



// package com.bookreview.review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ReviewDetails {
    @Id
    private int book_id;
    private String b_name;
    private String a_name;
    private String  description;
    public ReviewDetails(int book_id, String b_name, String a_name, String description) {
        this.book_id = book_id;
        this.b_name = b_name;
        this.a_name = a_name;
        this.description = description;
    }
    public ReviewDetails(){}
    public int getBook_id() {
        return book_id;
    }
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
    public String getB_name() {
        return b_name;
    }
    public void setB_name(String b_name) {
        this.b_name = b_name;
    }
    public String getA_name() {
        return a_name;
    }
    public void setA_name(String a_name) {
        this.a_name = a_name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}