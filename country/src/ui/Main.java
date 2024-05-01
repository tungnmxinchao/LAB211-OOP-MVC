/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.CountryController;
import entity.Country;
import java.util.ArrayList;
import utils.DisplayUtils;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class Main {

    public static void main(String[] args) throws Exception {
        CountryController countryController = new CountryController();
        while (true) {
            //display gui
            DisplayUtils.displayMenu();
            // user enter choice
            int choice = GetDataUtils.getChoice("Enter your choice", 1, 6);
            // case
            switch (choice) {
                case 1:
                    try {
                    Country c = countryController.addCountry();
                    System.out.println(Country.STRING_COUNTRY);
                    System.out.println(c);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;
                case 2:
                    System.out.println(Country.STRING_COUNTRY);
                    System.out.println(countryController.displayAllCountry());
                    break;
                case 3:
                    ArrayList<Country> list = countryController.searchConutry();
                    System.out.println(Country.STRING_COUNTRY);
                    for (Country o : list) {
                        System.out.println(o);
                    }
                    break;
                case 4:
                    ArrayList<Country> listSort = countryController.displaySortedCountry();
                    System.out.println(Country.STRING_COUNTRY);
                    for (Country o : listSort) {
                        System.out.println(o);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
