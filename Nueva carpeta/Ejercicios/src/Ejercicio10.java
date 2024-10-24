import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args){
        double valor;
        float num;
        System.out.println("Dime un número");
        Scanner sp = new Scanner(System.in);
        num=sp.nextInt();
        valor=Math.abs(num);
        System.out.println("El valor absoluto de "+ num+ " es "+ valor);
    }
}
