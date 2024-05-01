/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Doctor;
import java.util.ArrayList;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class ManagerDoctor {

    private ArrayList<Doctor> listDoctor;

    public ManagerDoctor() {
        listDoctor = new ArrayList<>();
    }

    public boolean addDoctor(Doctor d) throws Exception  {
        if (getDoctorById(d.getCode()) == null) {
            return listDoctor.add(d);
        }
        throw new Exception("doctor not exsit!");
    }

    public Doctor getDoctorById(String code) {
        int index = findById(code);
        if (index != -1) {
            return listDoctor.get(index);
        }
        return null;
    }

    private int findById(String code) {
        for (int i = 0; i < listDoctor.size(); i++) {
            if (listDoctor.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public  ArrayList<Doctor> getListDoctor(String name) {
        ArrayList<Doctor> listSearch = new ArrayList<>();
        for (Doctor o : listDoctor) {
            if(o.getName().toLowerCase().contains(name.toLowerCase())){
                listSearch.add(o);
            }
        }
        return listSearch;
    }

    public Doctor deleDoctor(String code) throws Exception {
        int index = findById(code);
        if (index != -1) {
            return listDoctor.remove(index);
        }
        throw new Exception("Doctor not found!");
    }

    public Doctor updateDoctor(Doctor d) throws Exception {
        int index = findById(d.getCode());
        if (index != -1) {
            return listDoctor.set(index, d);
        }
        throw new Exception("Doctor not found!");
    }


}
