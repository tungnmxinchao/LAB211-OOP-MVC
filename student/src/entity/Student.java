/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TNO
 */
public class Student implements Comparable<Student>{
    private int id;
    private String studentName;
    private int semester;
    private CourseType courseName;

    public Student() {
    }

    public Student(int id, String studentName, int semester, CourseType courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public CourseType getCourseName() {
        return courseName;
    }

    public void setCourseName(CourseType courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
       return String.format("%-10d %-20s %-20d %-20s\b", id, studentName, semester, courseName);
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudentName().compareTo(o.getStudentName());
    }

    
  
    
}
