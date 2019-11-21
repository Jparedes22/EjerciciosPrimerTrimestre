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
public class Condiciones {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número");
        num=teclado.nextInt();
        int multiplo=num%20;
        if(multiplo==0&&num<100&&num>-100){
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        }else if(multiplo==0&&(num>=100||num<=-100)){
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");
        }else if(multiplo!=0&&num<100&&num>-100){
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");
        }else if(multiplo!=0&&(num>100||num<-100)){
            System.out.println("No es múltiplo de 20 y no está entre -100 y 100");
        }else{
            System.out.println("Número no válido");
        }
        
        
    }
}
