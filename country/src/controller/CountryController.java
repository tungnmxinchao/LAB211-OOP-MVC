/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.inputerCountry;
import bo.managerCountry;
import entity.Country;
import java.util.ArrayList;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class CountryController {

    private inputerCountry inputerr;
    private managerCountry managerr;

    public CountryController() {
        managerr = new managerCountry();
    }

    public Country addCountry() throws Exception{
        inputerr = new inputerCountry();
        Country c = inputerr.getInfor();
        managerr.addCountry(c);
        return c;
    }

    public String displayAllCountry() {
        return managerr.toString();
    }

    public ArrayList<Country> searchConutry() {
        String name = GetDataUtils.getString("Enter name country :");
        return managerr.searchByName(name);
    }

    public ArrayList<Country> displaySortedCountry() {
        return managerr.getlistSortCountry();
    }

}
