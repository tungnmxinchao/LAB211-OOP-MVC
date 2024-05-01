/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentay3;

import bo.InsertionSort;
import utils.ArrayUtils;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class Luyentay3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // user ten size aray
        int size_aray = GetDataUtils.getInt("Enter number of array :");
        int[] array = ArrayUtils.createArrayRandom(size_aray);
        InsertionSort insert = new InsertionSort(array);
        
        System.out.println("array before sort");
        ArrayUtils.displayArray(array);
        System.out.println("array after sort");
        ArrayUtils.displayArray(insert.getSort());
    }
    
}
