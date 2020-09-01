package com.example.demo.Java;



public class Product {
  private   String name ;
  private  String tag  ;
  private  int price ;

  public Product(String name, String tag, int price) {
    this.name = name;
    this.tag = tag;
    this.price = price;
  }
  public Product(){};

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
