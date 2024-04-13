package com.example.demo;

public class Session {
    String tech;

    public Session(){
        super();
    }

    public Session (String tech){
        super();
        this.tech = tech;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Session [tech=" + tech + "]";
    }
    
}
