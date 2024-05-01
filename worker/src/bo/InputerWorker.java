/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Woker;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class InputerWorker {
    private Woker woker;

    public InputerWorker() {
        woker = new Woker();
    }
    
    

    public Woker getInputWoker() {
        
        String code = GetDataUtils.getString("Enter code:");
        String name = GetDataUtils.getString("Enter name:");
        int age = GetDataUtils.getInt("Enter age:", 0 , Integer.MAX_VALUE);
        double salary = GetDataUtils.getD("Enter salary: ", 0, Double.MAX_VALUE);
        
        woker.setCode(code);
        woker.setAge(age);
        woker.setName(name);
        woker.setSalary(salary);
        
        return woker;
    }

}
