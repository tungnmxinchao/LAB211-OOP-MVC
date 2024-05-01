/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Doctor;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class InputterDoctor {

    private Doctor doctor;

    public InputterDoctor() {
        doctor = new Doctor();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Doctor getInforDoctor() {
        String code = GetDataUtils.getString("Enter code: ");
        String name = GetDataUtils.getString("Enter name: ");
        String spec = GetDataUtils.getString("Enter specialation: ");
        int avai = GetDataUtils.getInt("Enter Avaibility", 0, Integer.MAX_VALUE);

        doctor.setAvailability(avai);
        doctor.setCode(code);
        doctor.setName(name);
        doctor.setSpecialization(spec);

        return doctor;

    }


 

}
