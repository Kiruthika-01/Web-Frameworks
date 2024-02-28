package com.bookreview.review.model;

// public class Books {
    
// }



// package com.bookreview.review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;

@Entity
// @Table(name="details")
public class Books {
    @Id
    private String b_name;
    private String a_name;
    
    private String description;
    public Books(String b_name, String a_name, String description) {
        this.b_name = b_name;
        this.a_name = a_name;
        this.description = description;
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