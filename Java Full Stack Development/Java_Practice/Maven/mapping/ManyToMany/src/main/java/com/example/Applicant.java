package main.java.com.example;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Applicant {
    @Id
    int Id;
    String name;
    String role;
    @ManyToMany
    List <Jobs> job;

    public Applicant(){
        super();
    }

    public Applicant(int Id, String name, String role, List<Jobs> job){
        super();
        this.Id = Id;
        this.name = name;
        this.role = role;
        this.job = job;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Jobs> getJob() {
        return job;
    }

    public void setJob(List<Jobs> job) {
        this.job = job;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Fresher [id=" + id + ", name=" + name +", role=" + role +", job= "+ job;
    }
}
