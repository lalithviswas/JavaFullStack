package main.java.com.oneToOne;

import javax.persistence.*;

@Entity
public class Passport {
    @Id
    int PId;
    String Country;
    @OneToOne
    Person person;

    public Passport(){
        super();
    }

    public Passport(int PId, String Country, Person person){
        super();
        this.PId = PId;
        this.Country = Country;
        this.person = person;
    }
    public int getPId() {
        return PId;
    }
    public void setPId(int pId) {
        PId = pId;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }
    public Person getPerson() {
        return Person;
    }
    public void setPerson(Person person) {
        person = person;
    }
}
