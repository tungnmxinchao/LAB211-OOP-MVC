/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.DoctorController;
import entity.Doctor;
import java.util.ArrayList;
import utils.DisplayUtils;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class Main {

    public static void main(String[] args) throws Exception{
        DoctorController doctorController = new DoctorController();
        while (true) {
            //display gui
            DisplayUtils.displayMenu();
            // user enter choice
            int choice = GetDataUtils.getChoice("Enter your choice", 1, 5);
            // case
            switch (choice) {
                case 1:
                    try {
                        Doctor d = doctorController.addDoctor();
                        System.out.println(Doctor.STRINNG_DOCTOR);
                        System.out.println(d);
                        System.err.println("add sucessfully");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Doctor update = doctorController.updateDoctor();
                        System.out.println(Doctor.STRINNG_DOCTOR);
                        System.out.println(update);
                        System.err.println("update sucessfully");
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        Doctor delete = doctorController.deleteDoctor();                      
                        System.out.println(Doctor.STRINNG_DOCTOR);
                        System.out.println(delete);
                        System.err.println("delete sucessfully");
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case 4:
                    ArrayList<Doctor> list = doctorController.searchDoctor();
                    System.out.println(Doctor.STRINNG_DOCTOR);
                    for (Doctor doctor : list) {
                        System.out.println(doctor);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
