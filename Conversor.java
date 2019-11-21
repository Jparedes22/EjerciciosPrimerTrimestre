
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
public class Conversor {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double euros;
        double dolares=1.09;
        double libras=0.89;
        double yens=117.89;
        System.out.println("Introduce el numero de euros que quieres convertir");
        euros= teclado.nextInt();
        System.out.printf("%.2f euro(s) son %.2f dólar(es)%n",euros,(dolares*euros));
        System.out.printf("%.2f euro(s) son %.2f yen(es)%n",euros,(yens*euros));
        System.out.printf("%.2f euro(s) son %.2f libra(s)%n",euros,(libras*euros));
        
        
        
    }
}
