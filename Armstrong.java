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
public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número de 3 dígitos");
        num = sc.nextInt();
        int num1 = num / 100;
        int num2 = (num - (num1 * 100)) / 10;
        int num3 = num - (num1 * 100 + num2 * 10);
        int arm = (num1 * num1 * num1) + (num2 * num2 * num2) + (num3 * num3 * num3);
        
        if (num < 100 || num > 999) {
            System.out.println("El número no tiene tres dígitos, maquinote");
        } else if (arm == num) {
            System.out.println("El número es Armstrong");
        } else {
            System.out.println("El número no es Armstrong");
        }
    }
}
