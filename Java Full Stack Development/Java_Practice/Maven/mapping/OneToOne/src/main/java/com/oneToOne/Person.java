package main.java.com.oneToOne;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    int Id;
    String name;
    @OneToOne
    Passport Passport;

    public Person(){
        super();
    }

    public Person(int Id, String name, Passport passport){
        super();
        this.Id = Id;
        this.name = name;
        this.passport = passport;
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
    public Passport getPassport() {
        return Passport;
    }
    public void setPassport(Passport passport) {
        Passport = passport;
    }
}
