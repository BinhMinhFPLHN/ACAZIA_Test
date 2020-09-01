package com.example.demo.Java;

public class Category {
   private  String name ;
   private  String categoryTag ;

    public Category(String name, String categoryTag) {
        this.name = name;
        this.categoryTag = categoryTag;
    }
    public Category(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }
}
