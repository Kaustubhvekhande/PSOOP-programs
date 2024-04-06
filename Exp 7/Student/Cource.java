import java.util.ArrayList;
import java.util.Collections;

abstract class Course {
    abstract void studentDetails();
}

class Comp extends Course {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, String UID, String year) {
        students.add(new Student(name, UID, year));
    }

    @Override
    void studentDetails() {
        Collections.sort(students);
        for (Student std : students) {
            System.out.println(std);
        }
    }
}


class IT extends Course {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, String UID, String year) {
        students.add(new Student(name, UID, year));
    }

    @Override
    void studentDetails() {
        Collections.sort(students);
        for (Student std : students) {
            System.out.println(std);
        }
    }
}

class Student implements Comparable<Student> {
    String name, UID, year;

    Student(String name, String UID, String year) {
        this.name = name;
        this.UID = UID;
        this.year = year;
    }

    @Override
    public int compareTo(Student other) {
        // Compare students based on year
        return this.year.compareTo(other.year);
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\nStudent ID : " + this.UID + "\nYear : " + this.year;
    }
}
