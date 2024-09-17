package ontapgk1;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {

    public static ArrayList<Student> stu = new ArrayList<>();

    public void addStudent(Student student) {
        student.addStudent();
        stu.add(student);
    }

    public void displayAllStudent() {
        Iterator<Student> iter = stu.iterator();
        while (iter.hasNext()) {
            Student s = iter.next();
            System.out.println(s);
        }
    }

    public void findStudentByID(String id) {
        for (Student student : stu) {
            if (id.equals(student.getId())) {
                System.out.println(student);
            }
        }
    }

    public void deleteStudentById(String id) {
        stu.removeIf(student -> id.equals(student.getId()));

    }

    public Student findTopStudent() {
        Student topst = stu.get(0);

        for (Student student : stu) {
            if (student.getGPA() > topst.getGPA()) {
                topst = student;
            }
        }
        for (Student student : stu) {
            if (topst.getId() == student.getId()) {
                System.out.println(topst);
            }
        }
        return topst;
    }

    void findSchoolarshipStudent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
