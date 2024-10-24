import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);
        System.out.println("¿Necesitas ir a la biblioteca?");
        boolean biblioteca = sn.nextBoolean();

        System.out.println("¿Has acabado las tareas?");
        boolean tareas= sn.nextBoolean();

        System.out.println("¿Está lloviendo??");
        boolean lloviendo= sn.nextBoolean();

        boolean condicion= (tareas && !lloviendo) || biblioteca;

        System.out.println("¿Puedes salir a la calle? "+ condicion);
    }
}
