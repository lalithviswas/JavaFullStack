package com.example;

import java.util.ArrayList;

import main.java.com.example.Applicant;
import main.java.com.example.Jobs;

import org.hibernate.*;

public class App 
{
    public static void main( String[] args )
    {
        Applicant a1 = new Applicant();
        Applicant a2 = new Applicant();

        ArrayList <Applicant> list1 = new ArrayList<>();
        list1.add(a1);
        list1.add(a2);

        Jobs j1 = new Jobs(101, "Amazon", list1);
        Jobs j2 = new Jobs(102, "Microsoft", list1);

        ArrayList <Jobs> list2 = new ArrayList<>();
        list2.add(j1);
        list2.add(j2);
        
        a1.setId(1);
        a1.setName("Lalith");
        a1.setRole("Developer");
        a1.setJob(list1);
        a2.setId(2);
        a2.setName("Viswas");
        a2.setRole("Analyst");
        a2.setJob(list2);

        //hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(); // a1, a2, j1, j2 --> saving all the sessions

        tx.commit();        
    }
}
