package Interface;

import Model.Teacher;

public interface ITeacher {
    Teacher creatTeacher();
    void teacherInfo(Teacher t1);
    void teacherArrayInfo(Teacher[] teachers);
    Teacher maxSalary(Teacher t1, Teacher t2);

}
