package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //Object Creation
        Student s = new Student(1, "Viswas", "CSE", 2024);
        
        //Hibernate Code
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        //Save the Object(s)
        session.save(s);

        //Commit Transaction
        tx.commit();    
    }
}
