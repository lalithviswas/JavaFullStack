package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int roll, yop;
    String name, branch;
    public Student(){
        super();
    }
    public Student(int roll, String name, String branch, int yop){
        super();
        this.roll=roll;
        this.name=name;
        this.branch=branch;
        this.yop=yop;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(){
        this.roll=roll;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(){
        this.branch=branch;
    }
    public int getYOP(){
        return yop;
    }
    public void setYOP(){
        this.yop=yop;
    }
    public String toString(){
        return "Student [roll=" + roll + ", name=" + name +", branch=" + branch + "yop= "+ yop + " ]";
    }
    public void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}
