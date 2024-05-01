/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.CourseType;
import entity.Student;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class InputerStudent {

    private Student s;

    public InputerStudent() {
        s = new Student();
    }

    public Student getInputStudent() throws Exception {
        int id = GetDataUtils.getInt("Enter id: ", 0, Integer.MAX_VALUE);
        String name = GetDataUtils.getString("Enter name: ");
        int sestem = GetDataUtils.getInt("Enter Sestember", 0, 9);
        int choiceCouse = GetDataUtils.getChoice("1. Java\n 2. .NET\n 3. C/ 4. C++\n Enter Course: ", 1, 4);
        CourseType courseType = null;

        switch (choiceCouse) {
            case 1:
                courseType = CourseType.Java;
                break;
            case 2:
                courseType = CourseType.Net;
                break;
            case 3:
                courseType = CourseType.c;
                break;
            case 4:
                courseType = CourseType.c2;
                break;
        }

        s.setId(id);
        s.setStudentName(name);
        s.setCourseName(courseType);
        s.setSemester(sestem);

        return s;

    }

}
