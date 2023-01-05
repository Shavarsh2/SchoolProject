package Servise;

import Interface.ITeacher;
import Model.Teacher;

import java.util.Scanner;

public class TeacherServise implements ITeacher {

    @Override
    public Teacher creatTeacher() {
        Teacher t = new Teacher();
        Scanner sc = new Scanner(System.in);
        System.out.print("Teacher first name - ");
        t.setFirstName(sc.next());
        System.out.print("Teacher last name - ");
        t.setLastName(sc.next());
        System.out.print("Teacher age - ");
        t.setAge(sc.nextInt());
        System.out.print("Teacher specialist - ");
        t.setSpecialist(sc.next());
        System.out.print("Teacher salary - ");
        t.setSalary(sc.nextInt());

        return t;
    }

    @Override
    public void teacherInfo(Teacher t1) {
        System.out.printf("firstName - %s, lastName - %s, Age - %d, Specialist - %s, Salary - %d",
                t1.getFirstName(),
                t1.getLastName(),
                t1.getAge(),
                t1.getSpecialist(),
                t1.getSalary());
        System.out.println();
    }

    @Override
    public void teacherArrayInfo(Teacher[] teachers) {
        for (Teacher t : teachers){
            teacherInfo(t);
        }
    }

    @Override
    public Teacher maxSalary(Teacher t1, Teacher t2) {
        if(t1.getSalary() > t2.getSalary()){
            return t1;
        }
        return t2;
    }
}
