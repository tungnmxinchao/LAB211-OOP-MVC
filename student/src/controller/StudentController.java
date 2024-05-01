/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.InputerStudent;
import bo.ManagerStudent;
import entity.Report;
import entity.Student;
import java.util.ArrayList;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class StudentController {

    private InputerStudent inputerStudent;
    private ManagerStudent managerStudent;

    public StudentController() {
        managerStudent = new ManagerStudent();
    }

    public Student addStudent() throws Exception {
        inputerStudent = new InputerStudent();
        Student s = inputerStudent.getInputStudent();
        if (managerStudent.addStudent(s)) {
            return s;
        }
        throw new Exception("Add failed!");
    }

    public void dispkayStudent() {
        managerStudent.display();
    }

    public ArrayList<Student> searchAndSort() {
        String name = GetDataUtils.getString("Enter name: ");
        ArrayList<Student> listSearch = managerStudent.searching(name);
        ArrayList<Student> listSort = managerStudent.sorting(listSearch);
        return listSort;
    }

    public ArrayList<Report> reportStudent() {
        return managerStudent.reportDisplay();
    }

    public ArrayList<Student> displayListFoundById(int id) {
        return managerStudent.getListFoundById(id);
    }

    public Student deleteStudent(Student idStudentChoice) throws Exception {
        return managerStudent.deleteStudent(idStudentChoice);
    }

    public Student updateStudent(Student StudentChoice) throws Exception {
        inputerStudent = new InputerStudent();
        Student s = inputerStudent.getInputStudent();
        managerStudent.updateStudent(StudentChoice, s);
        return s;
    }

}
