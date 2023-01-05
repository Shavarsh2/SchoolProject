package Interface;

import Model.Student;

public interface IStudent {
    Student creatStudent();
    void printStudentInfo(Student st);
    Student printLongName(Student student1,Student student2);
    String maxAgeStudentName(Student[] students);
    void nameBeginsWithA(Student[] students);
    Student maxValuationSt(Student student1,Student student2);
    void printStudents(Student[] students);
}
