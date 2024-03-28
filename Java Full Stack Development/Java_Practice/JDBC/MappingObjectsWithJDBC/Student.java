package Java_Practice.JDBC.MappingObjectsWithJDBC;

public class Student {
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
}
