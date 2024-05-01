/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import utils.ArrayUtils;

/**
 *
 * @author TNO
 */
public class InsertionSort {

    private int[] arr;

    public InsertionSort() {
    }

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getSort() {
        return sorted();
    }

    private int[] sorted() {
        int array[] = arr;
        array = ArrayUtils.cloneArray(arr);

            for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j+ 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

}
