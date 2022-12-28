package map;

import studentcoursemodel.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> students= new LinkedHashMap<>();

        students.put(101,new Student("Jane","McDonald","101","Address",78));
        students.put(102,new Student("Mike","Hammer","102","Address",79));
        students.put(103,new Student("John","Doe","103","Address",80));
        students.put(104,new Student("Mark","Mustermann","104","Address",91));
        students.put(105,new Student("Sam","Curly","105","Address",22));

        for (Integer studentsKey: students.keySet()) {
            System.out.println(studentsKey+" - " + students.get(studentsKey).toString());
        }
    }
}
