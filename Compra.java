
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neosu
 */
public class Compra {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double precio;
        double iva;
        System.out.println("Introduzca un precio con IVA inferior a 500€");
        precio=teclado.nextDouble();
        System.out.println("Introduzca un valor de IVA entre 0 y 25% en decimal");
        iva=teclado.nextDouble();
        System.out.printf("Precio de la compra: %.2f€ %n ",precio-(precio*iva));
        System.out.printf("IVA: %.2f€ %n ",precio*iva);
        System.out.println("     ======");
        System.out.printf("Precio total: %.2f€ %n",precio);
        
    }
}
