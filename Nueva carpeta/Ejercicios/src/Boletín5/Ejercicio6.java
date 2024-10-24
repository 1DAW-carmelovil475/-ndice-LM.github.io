package Boletín5;

public class Ejercicio6 {
    public static void main (String[] args){
        int suma=0;
        for (int a=0; a<=20; a+=2){
            suma= suma+a;
        }
        System.out.println("La suma de los pares del 1 al 20 es " +suma);
        long multi=1;
        for (int i=1; i<20; i+=2){
            multi*= i;
        }
        System.out.println("La multiplicación de todos los números impares del 1 al 20 es: " +multi);
    }
}
