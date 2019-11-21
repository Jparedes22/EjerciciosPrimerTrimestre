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
public class UnIncremento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce un número");
        int num = sc.nextInt();
        int multi2 = num % 2;
        int multi3 = num % 3;
        int multi5 = num % 5;

        if (multi2 == 0) {
            int suma1 = num + 2;
            System.out.println(suma1);
        } else if (multi3 == 0) {
            int suma2 = num + 3;
            System.out.println(suma2);
        } else if (multi5 == 0) {
            int suma3 = num + 5;
            System.out.println(suma3);
        } else {
            int suma4 = num + 1;
            System.out.println(suma4);
        }

    }
}
