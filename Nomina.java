
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 1
 */
public class Nomina {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int bruto;
        System.out.println("Introduce el salario bruto mensual");
        bruto= teclado.nextInt();
        double neto= bruto-(bruto*0.15);
        int pagas;
        System.out.println("Introduce el número de pagas");
        pagas= teclado.nextInt();
        int brutoAnual= bruto*pagas;
        System.out.printf("El salario bruto anual es %d %n",brutoAnual);
        System.out.printf("El salario neto mensual es %.2f %n", bruto-(bruto*0.15));
        System.out.printf("El salario neto anual es %.2f %n",brutoAnual -(brutoAnual*0.15));
        
        
        
        
    }
}
