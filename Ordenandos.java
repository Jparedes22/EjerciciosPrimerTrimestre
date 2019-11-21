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
public class Ordenandos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número");
        num2 = sc.nextInt();
        System.out.println("Introduce otro número");
        num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.printf("%d, %d, %d", num1, num2, num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.printf("%d, %d, %d", num1, num3, num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.printf("%d, %d, %d", num2, num1, num3);
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            System.out.printf("%d, %d, %d", num2, num3, num1);
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.printf("%d, %d, %d", num3, num1, num2);
        } else if (num3 > num1 && num3 > num2 && num2 > num1) {
            System.out.printf("%d, %d, %d", num3, num2, num1);
        } else {
            System.out.println("Alguno de los números es igual a otro");
        }
    }
}
