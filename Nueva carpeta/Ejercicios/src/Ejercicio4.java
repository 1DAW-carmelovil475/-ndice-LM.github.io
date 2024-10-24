import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args){

        int not1;
        int not2;
        int media;

        System.out.println("Dime la primera nota");
        Scanner sp = new Scanner(System.in);

        not1=sp.nextInt();
        System.out.println("Dime la segunda nota");
        Scanner sn = new Scanner(System.in);

        not2= sn.nextInt();

        media= (not1 + not2) / 2;

        System.out.println("La nota media entre ambas es " + media);
    }
}
