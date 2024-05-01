/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bo.ManagerStudent;
import controller.StudentController;
import entity.Report;
import entity.Student;
import java.util.ArrayList;
import utils.DisplayUtils;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class Main {

    public static void main(String[] args) throws Exception {
        StudentController studentController = new StudentController();
        while (true) {
            //display gui
            DisplayUtils.displayMenu();
            // user enter choice
            int choice = GetDataUtils.getChoice("Enter your choice", 1, 4);
            // case
            switch (choice) {
                case 1:
                    try {
                    Student s = studentController.addStudent();
                    System.out.println(s);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;
                case 2:
                    ArrayList<Student> listSearchAndSort = studentController.searchAndSort();
                    for (Student o : listSearchAndSort) {
                        System.out.println(o);
                    }
                    break;
                case 3:
                    int choiceAction = GetDataUtils.getChoice("1.Delete\n 2.Update\nEnter your choice:\n", 1, 2);
                    int id = GetDataUtils.getInt("Enrer ID:", 0, Integer.MAX_VALUE);
                    ArrayList<Student> list = studentController.displayListFoundById(id);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.format("%-10s %s\n", i + 1, list.get(i));
                    }
                    try {
                        int choiceStudentUserWant = GetDataUtils.getInt("Enter Number you want to delete/update:", 1, list.size());
                        Student StudentChoice = list.get(choiceStudentUserWant - 1);
                        switch (choiceAction) {
                            case 1:
                                Student deleteStudent = studentController.deleteStudent(StudentChoice);
                                System.out.println(deleteStudent);
                                break;
                            case 2:
                                Student updateStudent = studentController.updateStudent(StudentChoice);
                                System.out.println(updateStudent);
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
//                        studentController.dispkayStudent();
                    ArrayList<Report> listReport = studentController.reportStudent();
                    for (Report o : listReport) {
                        System.out.println(o);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
