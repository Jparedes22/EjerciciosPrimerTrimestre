
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
public class Factura {
    public static void main(String[] args) {
        int precio;
        Scanner teclado= new Scanner(System.in);
        final double IVA= 0.21;
        System.out.println("Introduce el precio del que quieres calcular la factura");
        precio=teclado.nextInt();
        System.out.printf("El precio sin IVA es %d %n:",precio);
        System.out.printf("El precio con IVA es %.2f %n",precio + (precio*IVA));
        
    }
}
