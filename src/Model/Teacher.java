package Model;

import Model.Person;

public class Teacher extends Person {
    private String specialist;
    private int salary;

    public String getSpecialist(){
        return specialist;
    }
    public void setSpecialist(String specialist){
        this.specialist = specialist;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{ " +
                "firstname - " + getFirstName() +
                ",lirstname - " + getLastName() +
                ",age - " + getAge() +
                ",specialist - " + specialist  +
                ", salary - " + salary +
                '}';
    }
}
