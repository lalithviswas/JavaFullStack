package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AppForCRUD 
{
    public static void main( String[] args ) throws Exception
    {
        create(); 
        //read();
        //update();
        //delete();   
    }
    
    public static void create(){

        Student s1 = new Student(1, "Lalith", "CSE", 2024);
        Student s2 = new Student(2, "Viswas", "CSE", 2024);
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(s1);
        session.save(s2);

        tx.commit();
    }

    public static void read(){
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Student st = session.get(Student.class, 1);
        System.out.println(st);
    }

    public static void update(){
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student st = session.get(Student.class, 1);
        st.setName("PSVK");

        session.save(st);

        tx.commit();
    }

    public static void delete(){
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student st = session.get(Student.class, 2);

        session.delete(st);

        tx.commit();
    }
}
