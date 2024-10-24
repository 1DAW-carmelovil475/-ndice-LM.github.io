package Boletín5;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont=1;
        while (cont != 0) {
            System.out.println("Dime un número");
            cont = sc.nextInt();
            if (cont != 0) {
                if (cont % 2 == 0) {
                    System.out.println(cont + " es un número par");
                } else {
                    System.out.println(cont + " es un número impar");
                }
            }else {
                System.out.println("Fin del proceso");
            }
        }
    }
}
