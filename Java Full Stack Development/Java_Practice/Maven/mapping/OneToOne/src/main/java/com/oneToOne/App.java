package com.oneToOne;

import org.hibernate.*;

import main.java.com.oneToOne.Passport;
import main.java.com.oneToOne.Person;

public class App 
{
    public static void main ( String[] args )
    {
        Person p1 = new Person();
        Person p2 = new Person();

        Passport pp1 = new Passport(1, "India", p1);
        Passport pp2 = new Passport(2, "India", p2);

        p1.setId(1);
        p1.setName("Lalith");
        p1.setPassport(pp1);

        p2.setId(2);
        p2.setName("Viswas");
        p2.setPassport(pp2);

        //hibernate code
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(p1);
        session.save(p2);
        session.save(pp1);
        session.save(pp2);

        tx.commit();
    }
}
