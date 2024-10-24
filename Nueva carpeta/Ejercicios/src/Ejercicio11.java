import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        double nota;
        float nota1;
        float nota2;
        float nota3;
        float notaboletin;
        float notaacademico;
        System.out.println("Dime tu nota del primer trimestre");
        Scanner sp = new Scanner(System.in);
        nota1=sp.nextFloat();
        System.out.println("Dime tu nota del segundo trimestre");
        Scanner sl = new Scanner(System.in);
        nota2=sl.nextFloat();
        System.out.println("Dime tu nota del tercer trimestre");
        Scanner sn = new Scanner(System.in);
        nota3=sn.nextFloat();
        notaboletin= (nota1+nota2+nota3)/3;
        nota= Math.round(notaboletin);
        notaacademico= (nota1+nota2+nota3)/3;
        System.out.println("La nota en el boletín de calificaciones es " + nota+ " y la nota enm el boletín académico es "+notaacademico);

    }

}
