package StudentFactory;

import java.util.ArrayList;
import java.util.List;

abstract class Student {
    private int StudentID;

    public Student() {
    }

    public Student(int _studentId) {
        this.StudentID = _studentId;
    }

}

class PrimarySchoolStudent extends Student {

    public PrimarySchoolStudent() {
    }

    public PrimarySchoolStudent(int _studentId) {
        super(_studentId);
    }
}

class HighSchoolStudent extends Student {

    public HighSchoolStudent() {
    }

    public HighSchoolStudent(int _studentId) {
        super(_studentId);
    }
}

abstract class ClassRoom {
    private List<Student> students;

    public void enrollStudent(int studentId) {
        if (students == null)
        {
            students = new ArrayList<Student>();
        }
        Student student = newStudent(studentId);
        students.add(student);
    }

    abstract Student newStudent(int studentId);
}

class HighSchoolClassRoom extends ClassRoom {

    @Override
    Student newStudent(int studentId) {
        return new HighSchoolStudent(studentId);
    }
}

class PrimarySchoolClassRoom extends ClassRoom {

    @Override
    Student newStudent(int studentId) {
        return new PrimarySchoolStudent(studentId);
    }
}

public class RunCode {
    public static void main(String[] args) {

        ClassRoom cr_highSchool = new HighSchoolClassRoom();
        cr_highSchool.enrollStudent(1234);
        cr_highSchool.enrollStudent(5678);
        cr_highSchool.enrollStudent(1938);
        cr_highSchool.enrollStudent(7465);
    }
}