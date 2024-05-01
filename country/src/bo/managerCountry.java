/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Country;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author TNO
 */
public class managerCountry {

    private ArrayList<Country> country;

    public managerCountry() {
        country = new ArrayList<>();
    }

    public boolean addCountry(Country c) throws Exception {
        if(!checkExistCountry(c.getCountryCode())){
            return country.add(c);
        }
        throw new Exception("Country Exist !");
    }

    private boolean checkExistCountry(String code) {
        for (Country o : country) {
            if (o.getCountryCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Country> searchByName(String name) {
        ArrayList<Country> listSearch = new ArrayList<>();
        for (Country o : country) {
            if (o.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                listSearch.add(o);
            }
        }
        return listSearch;
    }

    @Override
    public String toString() {
        String listAllCountry = "";
        for (Country o : country) {
            listAllCountry += o;
        }
        return listAllCountry;
    }

    public ArrayList<Country> getlistSortCountry() {
        Collections.sort(country);
        return country;
    }

    public boolean addUKCountry(Country c) throws Exception {
       if (!checkExistCountry(c.getCountryCode())) {
            return country.add(c);
        }
        throw new Exception("Country Exist !");
    }



}
