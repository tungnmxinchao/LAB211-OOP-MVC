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
public class Country implements Comparable<Country> {

    protected String countryCode;
    protected String countryName;
    protected float totalArea;
    public static final String STRING_COUNTRY = String.format("%-10s %-25s %-25s %-25s %-25s\n", "code", "name", "Area", "Terrian", "NumberRiver");

    public Country() {
    }

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

//    public void display() {
//        System.out.format("%-10s %-25s %-25s", countryCode, countryName, totalArea);
//    }
    @Override
    public String toString() {
        return String.format("%-10s %-25s %-25.0f", countryCode, countryName, totalArea);
    }

    @Override
    public int compareTo(Country o) {
        return this.getCountryName().compareTo(o.getCountryName());
    }

}
