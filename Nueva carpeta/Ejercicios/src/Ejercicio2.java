
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        int anyo_nac;
        int anyo_act;
        int edad;
        System.out.println("Dime tu año de nacimiento");
        Scanner sp = new Scanner(System.in);

        anyo_nac=sp.nextInt();

        System.out.println("Dime qué año es");
        Scanner sn = new Scanner(System.in);

        anyo_act=sn.nextInt();

        edad= anyo_act-anyo_nac;

        System.out.println("Tienes " + edad + " años");

    }

}
