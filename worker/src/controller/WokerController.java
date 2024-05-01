/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.InputerWorker;
import bo.ManagerWoker;
import entity.UpdateWoker;
import entity.Woker;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class WokerController {

    private InputerWorker inputerr;
    private ManagerWoker managerr;

    public WokerController() {
        managerr = new ManagerWoker();
    }

    public Woker addWoker() throws Exception {
        inputerr = new InputerWorker();
        Woker w = inputerr.getInputWoker();
        if (managerr.addWoker(w)) {
            return w;
        }
        throw new Exception("Add failed !");
    }

    public void displayWoker() {
        managerr.displayWoker();
    }

    public Woker updateUpSalaryWorker(UpdateWoker.StatusWorker statusWorker) throws Exception {
        String code = GetDataUtils.getString("Enter code:");
        double money = GetDataUtils.getD("Enter salary: ", 0, Double.MAX_VALUE);
        return managerr.updateWoker(code, money, statusWorker);
    }

    public String displayHistory() {
        return managerr.toString();
    }

}
