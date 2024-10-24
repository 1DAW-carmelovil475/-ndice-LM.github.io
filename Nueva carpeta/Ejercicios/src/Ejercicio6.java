import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){

        int edad;

        System.out.println("Dime la edad que tienes");
        Scanner sp = new Scanner(System.in);

        edad=sp.nextInt();

        boolean mayordeEdad= edad>=18;

        System.out.println("¿Eres mayor de edad?: " + mayordeEdad);
    }

}
