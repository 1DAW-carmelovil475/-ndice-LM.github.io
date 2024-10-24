import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args){

        float num;
        double numm;
        System.out.println("Dime un número decimal");
        Scanner sp = new Scanner(System.in);
        num=sp.nextFloat();
        numm= Math.round(num);
        System.out.println("El número redondeado es "+ numm);
    }
}
