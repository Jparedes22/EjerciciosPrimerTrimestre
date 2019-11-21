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
public class Capicua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número de 4 dígitos");
        num = sc.nextInt();
        int num1 = num / 1000;
        int num2 = (num - (num1 * 1000)) / 100;
        int num3 = (num - (num1 * 1000 + num2 * 100)) / 10;
        int num4 = num - (num1 * 1000 + num2 * 100 + num3 * 10);

        if (num < 999 || num > 10000) {
            System.out.println("El número no tiene 4 dígitos, listillo");
        } else if (num1 == num4 && num2 == num3) {
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número no es capicúa ");
        }

    }
}
