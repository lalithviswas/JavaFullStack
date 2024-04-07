package main.java.com.example;

import javax.persistence.*;
import java.util.ArrayList;;

@Entity
public class Jobs {
    @Id
    int Id;
    String company;
    @ManyToMany
    ArrayList <Applicant> applicants;
    
    public Jobs(){
        super();
    }

    public Jobs(int Id, String company, ArrayList <Applicant> applicants){
        super();
        this.Id = Id;
        this.name = name;
        this.applicants = applicants;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ArrayList<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(ArrayList<Applicant> applicants) {
        this.applicants = applicants;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Jobs [Id=" + Id +" Company=" + company + ", Applicants=" + applicants;
    }
}
