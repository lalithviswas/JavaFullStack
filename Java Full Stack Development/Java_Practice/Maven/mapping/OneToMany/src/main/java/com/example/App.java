package com.example;

import java.util.ArrayList;

import main.java.com.example.Customer;
import main.java.com.example.Orders;

import org.hibernate.*;

public class App 
{
    public static void main( String[] args )
    {
        Customer c1 = new Customer();
        Customer c2 = new Customer();

        Orders o1 = new Orders(101, "watch", 6000, c1);
        Orders o2 = new Orders(102, "glasses", 1000, c1);
        Orders o3 = new Orders(103, "shirt", 2000, c2);
        Orders o4 = new Orders(104, "shoes", 3000, c2);

        ArrayList <Orders> list1 = new ArrayList<Orders>();
        ArrayList <Orders> list2 = new ArrayList<Orders>();
        list1.add(o1);
        list1.add(o2);
        list2.add(o3);
        list2.add(o4);


        c1.setcId(1);
        c1.setName("Lalith");
        c1.setOrders(list1);

        c2.setcId(2);
        c2.setName("Viswas");
        c2.setOrders(list2);

        //hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(); // c1, c2, o1, o2, o3, o4 --> saving all the sessions

        tx.commit();
    }
}
