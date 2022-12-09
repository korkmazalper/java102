package studentcoursemodel;

import java.text.DecimalFormat;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        Student st1= new Student("aylin","bomba","123","adres 1",90);
        Student st2= new Student("semih","canta","12123","adres 2",190);
        Student st3= new Student("tankut","merhaba","1asd23","adres 1",50);
        Course mat= new Course("MAT101","MAT",new Instructor("Selma","Güney","Mathemtics"));
        Student[] students={st1,st2,st3};
        NumberFormat numberFormat=new DecimalFormat("#0.00");
        for (Student s:students) {
            System.out.println(s.getName() + " " + s.getSurname()+
                    ": " + numberFormat.format(s.getNote()));
        }
        System.out.println("Instructor:" + mat.getInstructor().getName()+ " "+ mat.getInstructor().getSurname());
        System.out.println("Average: " + numberFormat.format(mat.calculateAverage(students)));
    }
}
