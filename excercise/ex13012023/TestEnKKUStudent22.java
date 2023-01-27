package wissanu.ex13012023;

import java.util.*;

public class TestEnKKUStudent22 {
    public static void main(String[] args) {
        ArrayList<EnKKUStudent22> students = new ArrayList<EnKKUStudent22>();
        students.add(new COEStudent());
        students.add(new DMEStudent());
        int numStudents = students.size();
        for (int i = 0; i < numStudents; i++) {
            students.get(i).register();
        }
    }
}
class COEStudent extends EnKKUStudent22 {
    public void register() {
        System.out.println("A COE student registers EN811301 and EN811302");
    }
}
class DMEStudent extends EnKKUStudent22 {
    public void register(){
        System.out.println("A DME student registers EN843204 and EN843205");
    }
}
abstract class EnKKUStudent22 {
    abstract public void register();
}