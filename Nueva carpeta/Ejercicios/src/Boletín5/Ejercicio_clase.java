package Boletín5;

public class Ejercicio_clase {
    public static void main (String[] args){
        int multi=1;
        int sum=0;
        int cont1=0;
        int cont2=0;
        int i;
        for (i=1; i<=20; i++){
            if (i>5) {
                sum += i;
                cont1++;
            }else {
                multi*=i;
                cont2++;
            }
        }
        System.out.println("La suma de los números mayores que 5 es: "+sum);
        System.out.println("La multiplicación de los números menores o iguales a 5 es: "+multi);
        System.out.println("Hay "+cont1+" números mayores que 5");
        System.out.println("Hay "+cont2+" números menores o iguales que 5");
        System.out.println("El valor de i es: "+i);
    }
}
