
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marina Belén
 */
public class Capicua {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nro;
        int i;
        System.out.println("cuantas posiciones tiene el numero? ");
        i = s.nextInt();
        while (i >= 5 || i < 0) {

            System.out.println("ingrese un numero entre 1 y 4");

        }
        int[] numero = new int[i];

        for (i = 0; i < numero.length; i++) {
            do {
                System.out.println("introduzca el numero de la posicion " + i);
                numero[i] = s.nextInt();
                nro = numero[i];
            } while (nro < 0 ||  nro >= 9);
        }

        if (i == 4) {
            if (numero[0] == numero[3] && numero[1] == numero[2]) {
                System.out.println("el numero es capicua");
            }else {
                    System.out.println("el numero no es capicua");
                }
        }
            else    if (i == 3) {
                if (numero[0] == numero[2]) {

                    System.out.println("el numero es capicua");
                }else {
                    System.out.println("el numero no es capicua");
                } }
        
            else if (i == 2) {
                    if (numero[0] == numero[1]) {
                        System.out.println("el numero es capicua");
                    } else {
                    System.out.println("el numero no es capicua");
                }
                } 
                 
            else if (i == 1) {
                    System.out.println("el numero es capicua");
                } 
                  else {
                    System.out.println("el numero no es capicua");
                }
            
        
    }
}
