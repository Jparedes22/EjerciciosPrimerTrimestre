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
public class IncrementarDecrementar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número");
        num=sc.nextInt();
        
       int multi=num%2;
       
       if(multi==0){
           int resultado=num+1;
           System.out.println(resultado);
       }else{
           int resultado=num-1;
           System.out.println(resultado);
       }
        
    }
}
