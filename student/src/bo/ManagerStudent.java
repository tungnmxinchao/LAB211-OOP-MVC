/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.CourseType;
import entity.Report;
import entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TNO
 */
public class ManagerStudent {

    private ArrayList<Student> listStudent;
    private ArrayList<Report> listReport;

    public ManagerStudent() {
        listStudent = new ArrayList<>();
        listReport = new ArrayList<>();
    }

    public boolean addStudent(Student s) throws Exception {
        if (!checkExistStudent(s)) {
            return listStudent.add(s);
        }
        throw new Exception("Student exist!");
    }

    private boolean checkExistStudent(Student s) {
        for (Student o : listStudent) {
            if ((o.getId() == s.getId() && o.getStudentName().equalsIgnoreCase(s.getStudentName())
                    && o.getSemester() == s.getSemester() && o.getCourseName().equals(s.getCourseName()))) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    public ArrayList<Student> searching(String name) {
        ArrayList<Student> listSearch = new ArrayList<>();
        for (Student o : listStudent) {
            if (o.getStudentName().toLowerCase().contains(name.toLowerCase())) {
                listSearch.add(o);
            }
        }
        return listSearch;
    }

    public ArrayList<Student> sorting(ArrayList<Student> student) {
        Collections.sort(student);
        return student;
    }

    private int searchIndexByID(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Student getStudentByID(int id) throws Exception {
        int index = searchIndexByID(id);
        if (index != -1) {
            return listStudent.get(index);
        }
        return null;
    }

    public ArrayList<Report> reportDisplay() {
        HashMap<String, Integer> studentMap = new HashMap<>();

        for (Student student : listStudent) {
            String key = student.getId() + " " + student.getStudentName() + " " + student.getCourseName();
            int total = studentMap.getOrDefault(key, 0);
            studentMap.put(key, total + 1);
        }

        ArrayList<Report> listReports = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            String[] PartsOfKey = entry.getKey().split(" ");
            String studentId = PartsOfKey[0];
            String studentName = PartsOfKey[1];
            String coursType = PartsOfKey[2];
            int total = entry.getValue();
            listReports.add(new Report(studentId, studentName, coursType, total));
        }

        return listReports;
    }

    public ArrayList<Student> getListFoundById(int id) {
        ArrayList<Student> listFound = new ArrayList<>();
        for (Student o : listStudent) {
            if (o.getId() == id) {
                listFound.add(o);
            }
        }
        return listFound;
    }

    public Student deleteStudent(Student studentChoice) throws Exception {
        int IndexOfStudent = searchIndexOriginalList(studentChoice);
        if (IndexOfStudent != -1) {
            return listStudent.remove(IndexOfStudent);
        }
        throw new Exception("Student not found!");
    }

    private int searchIndexOriginalList(Student studentChoice) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).equals(studentChoice)) {
                return i;
            }
        }
        return -1;
    }

    public Student updateStudent(Student StudentChoice, Student s) throws Exception {
        int index = searchIndexOriginalList(StudentChoice);
        if (s != null && !(checkExistStudent(s))) {
            return listStudent.set(index, s);
        }
        throw new Exception("Student not found!");
    }

}
