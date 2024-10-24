package Boletín5;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a  = 0;
        int cont = 0;

        while(cont >= 0) {
            System.out.println("Dime un número");
            cont = sc.nextInt();
            if ( cont>=0) {
                a++;
            }else {
                System.out.println("Hay "+a+" números positivos");
            }
        }
    }
}
