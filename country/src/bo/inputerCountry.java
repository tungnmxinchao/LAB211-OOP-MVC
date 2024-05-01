/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Country;
import entity.EastAsiaCountry;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class inputerCountry {

    private Country c;

    public inputerCountry() {
        c = new EastAsiaCountry();
    }
    
    

    public Country getInfor() {
        
        getInforCommon();
        getInforEa();
        return c;
    }

    public void getInforCommon() {
        String code = GetDataUtils.getString("Enter code of country: ");
        String countryName = GetDataUtils.getString("Enter name of country:");
        float countryArea = GetDataUtils.getFloat("Enter area of country", 0, Float.MAX_VALUE);
        c.setCountryCode(code);
        c.setCountryName(countryName);
        c.setTotalArea(countryArea);
    }

    public void getInforEa() {

        if (c instanceof EastAsiaCountry) {
            String countryTerrain = GetDataUtils.getString("Enter terrain of country:");
            ((EastAsiaCountry) c).setCountryTerrain(countryTerrain);
        }
    }

}
