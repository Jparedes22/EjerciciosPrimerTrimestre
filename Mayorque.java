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
public class Mayorque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el primer número");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        num2=teclado.nextInt();
        if(num1>num2){
            System.out.println("El primero es mayor que el segundo");
        }else {
            System.out.println("El primero no es mayor que el segundo");
        }

    }

}
