/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.WokerController;
import entity.UpdateWoker;
import entity.Woker;
import utils.DisplayUtils;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class Main {

    public static void main(String[] args) throws Exception {
        WokerController wokerController = new WokerController();
        while (true) {
            //display gui
            DisplayUtils.displayMenu();
            // user enter choice
            int choice = GetDataUtils.getChoice("Enter your choice", 1, 6);
            // case
            switch (choice) {
                case 1:
                    try {
                        Woker w = wokerController.addWoker();
                        System.out.println(Woker.STRING_WORKER);
                        System.out.println(w);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Woker update = wokerController.updateUpSalaryWorker(UpdateWoker.StatusWorker.UP);
                        System.out.println(Woker.STRING_WORKER);
                        System.out.println(update);
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());;
                    }
                    break;
                case 3:
                    try {
                        Woker updatedown = wokerController.updateUpSalaryWorker(UpdateWoker.StatusWorker.DOWN);
                        System.out.println(Woker.STRING_WORKER);
                        System.out.println(updatedown);
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                    break;
                case 4:
                    System.out.println(Woker.STRING_WORKER);
                    System.out.println(wokerController.displayHistory());
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
