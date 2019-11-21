/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicast_03;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Inversos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        System.out.println("Introduce un número entre 100 y -100");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número entre 100 y -100");
        num2 = sc.nextInt();
        System.out.println("Introduce otro número entre 100 y -100");
        num3 = sc.nextInt();
        double inv1 = 1 / num1;
        double inv2 = 1 / num2;
        double inv3 = 1 / num3;
        double suma = inv1 + inv2 + inv3;
        
        if (num1 > -100 && num1 < 100 && num2 > -100 && num2 < 100 && num3 > -100 && num3 < 100) {
            System.out.printf("%.5f+%.5f+%.5f=%.5f%n",inv1,inv2,inv3, suma);
        } else {
            System.out.println("Alguno de los números no está entre -100 y 100");
        }

    }
}
