
import java.util.*;



abstract class Marks {
    abstract float getPercentage();
}

class A extends Marks {
    ArrayList<Subject> subjects = new ArrayList<>();

    void addSubject(String name, int marks) {
        subjects.add(new Subject(name, marks));
    }

    @Override
    float getPercentage() {
        float totalMarks = 0;
        for (int i = 0; i < subjects.size(); i++) {
            totalMarks += subjects.get(i).Marks;
        }
        return totalMarks / subjects.size();
    }

    void showPerformance() {
        Collections.sort(subjects);
        for (Subject sub : subjects) {
            System.out.println(sub);
        }
    }
}

class B extends Marks {
    ArrayList<Subject> subjects = new ArrayList<>();

    void addSubject(String name, int marks) {
        subjects.add(new Subject(name, marks));
    }

    @Override
    float getPercentage() {
        float totalMarks = 0;
        for (int i = 0; i < subjects.size(); i++) {
            totalMarks += subjects.get(i).Marks;
        }
        return totalMarks / subjects.size();
    }

    void showPerformance() {
        Collections.sort(subjects);
        for (Subject sub : subjects) {
            System.out.println(sub);
        }
    }
}

class Subject implements Comparable<Subject> {
    String subject;
    int Marks;

    Subject(String s, int m) {
        this.subject = s;
        this.Marks = m;
    }

    @Override
    public int compareTo(Subject other) {
        return Integer.compare(this.Marks, other.Marks)*-1;
    }

    public String toString() {
        return "The marks in " + subject + " is :" + Marks;
    }
}