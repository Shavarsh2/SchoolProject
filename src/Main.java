import Model.Student;
import Model.Teacher;
import Servise.StudentServise;
import Servise.TeacherServise;

public class Main {
    public static void main(String[] args) {
        StudentServise ser = new StudentServise();
        TeacherServise tServise = new TeacherServise();
        Student st1 = ser.creatStudent();
        Student st2 = ser.creatStudent();
        Student st3 = ser.creatStudent();
        Student[] students = {st1, st2, st3};
        System.out.println("-----------Student----------");
        ser.printStudentInfo(st1);
        System.out.println("-----------------------a");
        Student longName = ser.printLongName(st1, st2);
        System.out.println(longName.toString());
        System.out.println("-----------------------b");
        String st = ser.maxAgeStudentName(students);
        System.out.println(st);
        System.out.println("-----------------------c");
        ser.nameBeginsWithA(students);
        System.out.println("-----------------------d");
        Student maxVal = ser.maxValuationSt(st2, st1);
        System.out.println(maxVal.toString());
        System.out.println("-----------------------e");
        ser.printStudents(students);
        System.out.println("-----------------------f");
        System.out.println("---------Teacher--------");
        Teacher t1 = tServise.creatTeacher();
        Teacher t2 = tServise.creatTeacher();
        Teacher t3 = tServise.creatTeacher();
        Teacher[] teachers = {t1, t2, t3};
        tServise.teacherInfo(t1);
        System.out.println("-----------------------");
        tServise.teacherArrayInfo(teachers);
        System.out.println("-----------------------");
        Teacher maxSalary1 = tServise.maxSalary(t2, t3);
        System.out.println(maxSalary1.toString());

    }
}