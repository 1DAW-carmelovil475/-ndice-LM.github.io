package Boletin3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        int num1;
        int num2;
        System.out.println("Dime un número entero");
        Scanner sp = new Scanner(System.in);
        num1= sp.nextInt();
        System.out.println("Dime otro número entero");
        Scanner sc = new Scanner(System.in);
        num2=sc.nextInt();
        if (num1>num2){
            System.out.println(num1 +" > "+num2);
        } else if (num2>num1) {
            System.out.println(num2+" > "+num1);
        } else if (num1==num2) {
            System.out.println(num1+ " = "+ num2 );
        }
    }
}
