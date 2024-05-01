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

    public static int getInt(String mess) {
        Scanner sc = new Scanner(System.in);
        String input;
        double num = 0;

        while (true) {
            System.out.println(mess);
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Empty!");
                continue;
            }
            try {
                num = Double.parseDouble(input);
                if (num <= 0) {
                    throw new Exception();
                }
                if ((int) num != num) {
                    throw new Error();
                }else{
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("must be number");
            } catch (Exception nagativeNum) {
                System.out.println("not be les than zero!");
            } catch (Error realNum) {
                System.out.println("not be real number");
            }
            
        }
        return (int) num;
    }

}
