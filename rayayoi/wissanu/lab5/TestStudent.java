package rayayoi.wissanu.lab5;

public class TestStudent {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        Student[] students = new Student[NUM_STUDENTS];
        students[0] = new DmeEnStudent("Manee");
        students[1] = new ComEnStudent("Mana");
        students[2] = new ComEnStudent("Pitti");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            students[i].writePrograms();
        }
    }
}

abstract class Student {
    protected String name;

    public Student(String student) {
        this.name = student;
    }

    abstract void writePrograms();
}
class ComEnStudent extends Student {
    public ComEnStudent(String name) {
        super(name);
    }
    void writePrograms() {
        System.out.println(name + " writes programs in Python and Java");
    }
}
class DmeEnStudent extends Student {
    public DmeEnStudent(String name) {
        super(name);
    }
    void writePrograms() {
        System.out.println(name + " writes programs in Python and C#");
    }
}
