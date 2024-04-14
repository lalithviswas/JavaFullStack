package com.example.demo;

public class Classroom {
    Session session;

    public Classroom(){
        super();
    }
    
    public Classroom(Session session){
        super();
        this.session = session;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Classroom [session=" + session + "]";
    }
    
}
