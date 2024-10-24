import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        int num;

        System.out.println("Dime un número");
        Scanner sp = new Scanner(System.in);

        num=sp.nextInt();
        boolean numeroPar= num % 2== 0;

        System.out.println("¿Tu número es Par? " + numeroPar);
    }

}
