import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args){

        float kgpera;
        float kgmanzana;
        double total;
        System.out.println("¿Cuántos kg de manzanas vas a comprar?");
        Scanner sp = new Scanner(System.in);

        kgmanzana=sp.nextFloat();

        System.out.println("Cuántos kg de peras vas a comprar");
        Scanner sn= new Scanner(System.in);
        kgpera=sn.nextFloat();

        total= kgmanzana*2.35 + kgpera*1.95;
        System.out.print("Es importe total entre los kg de pera y de manzana es: "+ total);
    }

}
