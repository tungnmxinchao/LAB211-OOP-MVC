/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Random;

/**
 *
 * @author TNO
 */
public class ArrayUtils {

    public static int[] createArrayRandom(int size_aray) {
        int[] array = new int[size_aray];
        Random rd = new Random();
        for (int i = 0; i < size_aray; i++) {
            array[i] = rd.nextInt(size_aray);
        }
        return array;
    }

    public static void displayArray(int[] array) {
        System.out.print("[");
        //Loop use to accessed each element of array and display
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            //Check index to Display comma
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }

    public static int[] cloneArray(int[] arr) {
        int[] copiedArray = arr.clone();
        return copiedArray;
    }

}
