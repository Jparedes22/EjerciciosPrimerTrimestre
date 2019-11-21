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
public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Introduce el año");
        year=sc.nextInt();
        int multiplo1=year%4;
        int multiplo2=year%100;
        int multiplo3=year%400;
        if(multiplo1==0){
            System.out.println("El año es bisiesto");
        }else if(multiplo2!=0){
            System.out.println("El año no es bisiesto");
        }else if(multiplo3==0){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año introducido no es válido");
        }
        
    }
}
