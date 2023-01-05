package Model;

import Model.Person;

public class Student extends Person {
    private int valuation;
    private int classNumber;

    public int getValuation() {
        return valuation;
    }

    public void setValuation(int valuation) {
        this.valuation = valuation;
    }

    public int getClassNumber(){
        return classNumber;
    }
    public void setClassNumber(int classNumber){
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "firstname - " + getFirstName() +
                ",lirstname - " + getLastName() +
                ",age - " + getAge() +
                ",valuation - " + valuation +
                ",classNumber - " + classNumber +
                '}';
    }

}
