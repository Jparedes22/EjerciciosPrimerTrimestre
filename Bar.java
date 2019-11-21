
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
public class Bar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double bebidas;

        double bocadillos;
        System.out.println("Introduzca el número de bebidas");
        bocadillos = teclado.nextInt();
        System.out.println("Introduzca el número de bocadillos");
        bebidas = teclado.nextInt();
        double precioBebidas = bebidas * 1.25;
        double precioBocadillos = bocadillos * 2.05;
        double precioTotal = precioBebidas + precioBocadillos;
        System.out.printf("Número de bebidas %.2f%n", bebidas);
        System.out.printf("Número de bocadillos %.2f%n", bocadillos);
        System.out.printf("Coste de las bebidas %.2f%n", precioBebidas);
        System.out.printf("Coste de los bocadillos %.2f%n", precioBocadillos);
        System.out.printf("Precio total: %.2f%n", precioTotal);

    }
}
