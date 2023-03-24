package rayayoi.wissanu.AdvCom;

import java.io.*;
import java.util.ArrayList;

public class ProcessStudents {

    public static void main(String[] args) {
        Student manee = new Student("Manee", 3.8);
        manee.addActivities(new ArrayList<>(java.util.Arrays.asList("Running Marathon", "Helping hospital patients")));
        System.out.println(manee);
        writeToFile(manee);
        readFromFile();
    }

    public static void writeToFile(Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.txt"))) {
            oos.writeObject(student);
            System.out.println("Student object has been written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}






    
