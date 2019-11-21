
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
public class FormatoPersonas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Introduzca nombre y apelidos ");
        nombre = teclado.next();
        teclado.nextLine();
        double altura;
        System.out.println("¿Cuánto mide?");
        altura = teclado.nextDouble();
        teclado.nextLine();
        int edad;
        System.out.println("Introduzca edad");
        edad = teclado.nextInt();
        teclado.nextLine();
        boolean carnet = true;
        System.out.println("¿Tiene carnet de conducir?");
        carnet = teclado.nextBoolean();
        teclado.nextLine();
        String dni;
        System.out.println("¿Cual es la letra su dni?");
        dni = teclado.next();
        teclado.nextLine();

        String nombre2;
        System.out.println("Introduzca nombre y apelidos ");
        nombre2 = teclado.next();
        teclado.nextLine();
        double altura2;
        System.out.println("¿Cuánto mide?");
        altura2 = teclado.nextDouble();
        teclado.nextLine();
        int edad2;
        System.out.println("Introduzca edad");
        edad2 = teclado.nextInt();
        teclado.nextLine();
        boolean carnet2 = true;
        System.out.println("¿Tiene carnet de conducir?");
        carnet2 = teclado.nextBoolean();
        teclado.nextLine();
        String dni2;
        System.out.println("¿Cual es la letra su dni?");
        dni2 = teclado.next();
        System.out.println("NOMBRE           EDAD  ALTURA CARNET LETRA");
        System.out.println("================ ===== ====== ====== =====");
        System.out.printf("%s          %d   %.2f    %b      %s %n", nombre, edad, altura, carnet, dni);
        System.out.printf("%s          %d   %.2f    %b      %s %n", nombre2, edad2, altura2, carnet2, dni2);

    }
}
