package Boletín5;

public class Ejercicio5 {
    public static void main (String[] args){
        long acum=1;
        for (int i=1; i<=20; i++){
            acum*= i;
        }
        System.out.println("La multiplicación de todos los números del 1 al 20 es "+ acum);
    }
}