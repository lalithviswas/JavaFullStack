package com.example.demo;

import java.util.*;

public class Person {
    List <String> names;
    Set <String> rules;
    Map <Integer, String> sessions;
    
    public Person() {
        super();
    }
    
    public Person(List<String> names, Set<String> rules, Map<Integer, String> sessions) {
        super();
        this.names = names;
        this.rules = rules;
        this.sessions = sessions;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Set<String> getRules() {
        return rules;
    }

    public void setRules(Set<String> rules) {
        this.rules = rules;
    }

    public Map<Integer, String> getSessions() {
        return sessions;
    }

    public void setSessions(Map<Integer, String> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "Person [names=" + names + ", rules=" + rules + ", sessions=" + sessions + "]";
    }

}
