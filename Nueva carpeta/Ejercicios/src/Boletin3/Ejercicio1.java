package Boletin3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        float num;
        System.out.println("Dime un número");
        Scanner sp = new Scanner(System.in);
        num =sp.nextFloat();
        if (num==0){
            System.out.println("Tu número es 0");
        } else if (num>0) {
            System.out.println("Tu número es positvo");
        } else if (num<0) {
            System.out.println("Tu número es negativo");
        }
    }
}
