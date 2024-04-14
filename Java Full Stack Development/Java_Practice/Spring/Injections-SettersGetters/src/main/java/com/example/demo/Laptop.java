package com.example.demo;

public class Laptop {

    String name;
    int price;

    public Laptop(){
        super();
    }

    public Laptop(String name, int price){
        super();
        this.name = name;
        this.price = price;
        System.out.println("Constructor is used");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter is used");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("Setter is used");
    }

    @Override
    public String toString() {
        return "Laptop [name=" + name + ", price=" + price + "]";
    }
}
