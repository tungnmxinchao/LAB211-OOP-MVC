/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.InputterDoctor;
import bo.ManagerDoctor;
import entity.Doctor;
import java.util.ArrayList;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class DoctorController {

    private InputterDoctor inputerDoctor;
    private ManagerDoctor managerDoctor;

    public DoctorController() {

        managerDoctor = new ManagerDoctor();
    }

    public Doctor addDoctor() throws Exception{
        inputerDoctor = new InputterDoctor();
        Doctor d = inputerDoctor.getInforDoctor();
        if(managerDoctor.addDoctor(d)){
            return d;
        }
        throw new Exception("Add failed !");
    }
    
    public ArrayList<Doctor> searchDoctor() {
        String name = GetDataUtils.getString("Enter text: ");
        return managerDoctor.getListDoctor(name);
    }

    public Doctor deleteDoctor() throws Exception {
        String code = GetDataUtils.getString("Enter code: ");
        return managerDoctor.deleDoctor(code);
    }

    public Doctor updateDoctor() throws Exception {
        inputerDoctor = new InputterDoctor();
        Doctor d = inputerDoctor.getInforDoctor();
        return managerDoctor.updateDoctor(d);
    }

}
