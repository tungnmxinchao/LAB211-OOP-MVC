/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.UpdateWoker;
import entity.Woker;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author TNO
 */
public class ManagerWoker {
    private UpdateWoker updateWorker;
    private ArrayList<Woker> woker;
    private ArrayList<UpdateWoker> wokerUpdate;

    public ManagerWoker() {
        updateWorker = new UpdateWoker();
        woker = new ArrayList<>();
        wokerUpdate = new ArrayList<>();
    }

    public boolean addWoker(Woker w) throws Exception {
        if (getWokerById(w.getCode()) == null) {
            return woker.add(w);
        }
        throw new Exception("woker exist");
    }

    public void displayWoker() {
        for (Woker o : woker) {
            System.out.println(o);
        }
    }

    private int findById(String code) {
        for (int i = 0; i < woker.size(); i++) {
            if (woker.get(i).getCode().contains(code)) {
                return i;
            }
        }
        return -1;
    }

    public Woker getWokerById(String code) throws Exception {
        int index = findById(code);
        if (index != -1) {
            return woker.get(index);
        }
        return null;
    }

    public Woker updateWoker(String code, double money, UpdateWoker.StatusWorker statusWorker) throws Exception {
        Woker w = getWokerById(code);
        if(w == null){
            throw new Exception("ID not found!");
        }
        double update = 0;
        switch (statusWorker) {
            case UP:             
                update = w.getSalary() + money;  
                break;
            case DOWN:
               if(money > w.getSalary()){
                   throw new Exception("Money not be more than salary of Worker");
               }
                update = w.getSalary() - money;
                break;
        }
        w.setSalary(update);
        updateWorker.setSalaryUpdate(update);
        updateWorker.setStatusWorker(statusWorker);
        updateWorker.setDate(LocalDate.now());
        wokerUpdate.add(new UpdateWoker(w, updateWorker.getSalaryUpdate(), updateWorker.getDate(), updateWorker.getStatusWorker()));
        return w;
    }

    @Override
    public String toString() {
        String listUpdate = "";
        for (UpdateWoker o : wokerUpdate) {
            listUpdate += o;
        }
        return listUpdate;
    }

}
