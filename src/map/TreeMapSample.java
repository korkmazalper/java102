package map;

import studentcoursemodel.Student;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<Integer, Student> students= new TreeMap<>(new OrderByNoComparator());

        students.put(103,new Student("Jane","McDonald","103","Address",78));
        students.put(102,new Student("Mike","Hammer","102","Address",79));
        students.put(101,new Student("John","Doe","101","Address",80));
        students.put(100,new Student("Mark","Mustermann","100","Address",91));
        students.put(105,new Student("Sam","Curly","105","Address",22));
        for (Student studentsKey: students.values()) {
            System.out.println(studentsKey+" - " );
        }
        for (Integer studentsKey: students.keySet()) {
            System.out.println(studentsKey+" - " + students.get(studentsKey).toString());
        }
    }
}
