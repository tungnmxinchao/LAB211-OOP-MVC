/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TNO
 */
public class EastAsiaCountry extends Country {

    private String countryTerrain;

    public EastAsiaCountry() {
    }

    public EastAsiaCountry(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountry(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }
//    @Override
//    public void display() {
//        super.display();
//        System.out.format(" %-25s\n", countryTerrain);//To change body of generated methods, choose Tools | Templates.
//    }
    @Override
    public String toString() {
        return String.format(super.toString()+"%-25s\n", countryTerrain);
    }  
    
    

}
