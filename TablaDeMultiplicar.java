/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class TablaDeMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número entre el 0 y el 10");
            num = sc.nextInt();
        } while (num < 0 || num > 10);

        for (int i = 0; i <= 10; i++) {
            int multi = num * i;
            System.out.printf("%d x %d=%d%n", num, i, multi);
        }

    }
}
