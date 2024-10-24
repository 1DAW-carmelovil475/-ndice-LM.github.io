import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){

        float num1;
        float num2;
        float num3;
        System.out.println("Dime un número");
        Scanner sp = new Scanner(System.in);
        num1=sp.nextFloat();
        System.out.println("Dime otro número");
        Scanner sc = new Scanner(System.in);
        num2=sc.nextFloat();
        System.out.println("Dime otro número");
        Scanner sl = new Scanner(System.in);
        num3=sl.nextFloat();
        if (num1>num2 && num2>num3) {
            System.out.println("El orden de los números es " + num1 + " > " + num2 + " > " + num3);
        }else if (num2>num1 && num1> num3) {
            System.out.println("El orden de los números es " + num2 + " > " + num1 + " > " + num3);
        } else if (num3>num1 && num1> num2) {
            System.out.println("El orden de los números es " + num3+ " > " + num1 + " > " + num2);
        } else if (num3>num1 && num2> num1) {
            System.out.println("El orden de los números es " + num3+ " > " + num2 + " > " + num1);
        }else if (num1>num3 && num3> num2) {
            System.out.println("El orden de los números es " + num1+ " > " + num3 + " > " + num2);
        }else if (num2>num3 && num3> num1) {
            System.out.println("El orden de los números es " + num2+ " > " + num3 + " > " + num1);
        }
    }
}
