package studentcoursemodel;

public class Course {
    private String courseName;
    private String courseCode;
    private Instructor instructor;

    public Course(String courseName, String courseCode, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor=instructor;
    }
    public double calculateAverage(Student[] students){
        double average=0.0;
        for (Student student : students) {
            average += student.getNote();
        }
        return average/ students.length;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
