import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        double lon;
        double area;
        double radio;

        System.out.println("Di cuál es el radio de la circunferencia");
        Scanner sp = new Scanner(System.in);

        radio=sp.nextFloat();

        area= Math.PI * (radio*radio);
        lon= 2*Math.PI * radio;

        System.out.println("La longitud de la circunferencia es " + lon + " y el área es " + area );
    }
}
