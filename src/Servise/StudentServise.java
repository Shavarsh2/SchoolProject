package Servise;

import Interface.IStudent;
import Model.Student;

import java.util.Scanner;

public class StudentServise implements IStudent {

    @Override
    public  Student creatStudent() {
        Scanner sc = new Scanner(System.in);
            Student st = new Student();
        System.out.print("Student first name - ");
            st.setFirstName(sc.next());
        System.out.print("Student last name - ");
            st.setLastName(sc.next());
        System.out.print("Student age - ");
            st.setAge(sc.nextInt());
        System.out.print("Student valuation - ");
            st.setValuation(sc.nextInt());
        System.out.print("Student class number - ");
            st.setClassNumber(sc.nextInt());

            return st;

    }

    @Override
    public void printStudentInfo(Student st) {
        System.out.printf("firstName - %s, lastName - %s, Age - %d, valuation - %d, classNumber - %d",
                st.getFirstName(),
                st.getLastName(),
                st.getAge(),
                st.getValuation(),
                st.getClassNumber());
        System.out.println();
    }

    @Override
    public Student printLongName(Student student1,Student student2) {
        if(student1.getFirstName().length() > student2.getFirstName().length())
            return student1;
        return student2;

    }

    @Override
    public String maxAgeStudentName(Student[] students) {
        Student x = students[0];
        for (Student st:students) {
            if(st.getAge() > x.getAge()){
                x = st;
            }
        }
        return x.getFirstName();
    }

    @Override
    public void nameBeginsWithA(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if(students[i].getFirstName().charAt(0) == 'A'){
                printStudentInfo(students[i]);
            }
        }
    }

    @Override
    public Student maxValuationSt(Student student1, Student student2) {
       if(student1.getValuation() > student2.getValuation()){
           return student1;
       }
       return student2;
    }

    @Override
    public void printStudents(Student[] students) {
        for(int i = 0;i < students.length;i++){
            printStudentInfo(students[i]);
        }
    }
}
