package main.java.com.example;

import java.util.List;

@Entity
public class Customer {
    @Id
    int cId;
    String name;
    @OneToMany
    ArrayList <Orders> orders; 
    public Customer(){
        super();
    }
    public Customer(int cId, String name, List <Orders> orders){
        super();
        this.cId = cId;
        this.name = name;
        this.orders = orders;
    }
    public int getcId() {
        return cId;
    }
    public void setcId(int cId) {
        this.cId = cId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Orders> getOrders() {
        return orders;
    }
    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
