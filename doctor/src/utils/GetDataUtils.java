/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author TNO
 */
public class GetDataUtils {

    public static int getChoice(String mess, int min, int max) {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println(mess);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Empty!");
                continue;
            }
            try {
                int num = Integer.parseInt(input);
                if (num < min || num > max) {
                    System.out.println("Number not in range!");
                } else {
                    return num;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Must be number");
            }
        }
    }

    public static String getString(String mess) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println(mess);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Empty!");
            } else {
                return input;
            }
        }
    }

    public static float getFloat(String mess, double min, double max) {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println(mess);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Empty!");
                continue;
            }
            try {
                float num = Float.parseFloat(input);
                if (num < min || num > max) {
                    System.out.println("Not in range");
                } else {
                    return num;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input must be number!");
            }
        }
    }

    public static int getInt(String mess, int min, int max) {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println(mess);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Empty!");
                continue;
            }
            try {
                float num = Integer.parseInt(input);
                if (num < min || num > max) {
                    System.out.println("Not in range");
                } else {
                    return (int) num;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input must be number!");
            }
        }
    }

}
