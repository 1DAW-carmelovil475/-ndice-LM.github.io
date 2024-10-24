package Boletín5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        int num1;
        System.out.println("Dime un número entero y positivo");
        Scanner sc=new Scanner(System.in);
        num1= sc.nextInt();
        while(num1>=0){
            System.out.println((num1--));
        }
    }
}
