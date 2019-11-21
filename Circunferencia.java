
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
public class Circunferencia {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int radio;
        System.out.println("Introduzca el radio de la circunferencia");
        radio=teclado.nextInt();
        double longitud=2*Math.PI*radio;
        double area=Math.PI*(radio^2);
        System.out.printf("El área de la circunferencia es: %.2f%n",area);
        System.out.printf("La longitud de la circunferencia es: %.2f%n",longitud);
        
    }
}
