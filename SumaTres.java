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
public class SumaTres {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1;
        System.out.println("Introduce el primer número");
        num1=teclado.nextInt();
        int num2;
        System.out.println("Introduce el segundo número");
        num2=teclado.nextInt();
        System.out.println("Introduce el tercer número");
        int num3;
        num3=teclado.nextInt();
        int suma12=num1+num2;
        int suma13=num1+num3;
        int suma23=num2+num3;
        if(suma12==num3){
            System.out.printf("%d=%d+%d",num3,num1,num2);
        }else if (suma13==num1){
            System.out.printf("%d=%d+%d",num2,num1,num3);
        }else if(suma23==num1){
             System.out.printf("%d=%d+%d",num1,num2,num3);
        }else{
            System.out.println("Ninguno es suma de los otros dos");
        }
        
    }
}
