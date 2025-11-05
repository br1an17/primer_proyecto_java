

import java.util.Random;
import java.util.Scanner;

/*Crea un programa que simule un juego de adivinanzas. El programa debe
 generar un número aleatorio entre 0 y 100, y pedir al usuario que intente
 adivinar ese número en un máximo de 5 intentos.
 En cada intento, el programa debe informar si el número ingresado por el
 usuario es mayor o menor que el número generado.*/

public class JuegoDeAdivinansas {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int numeroUsuario = 0;
        System.out.println(numero);
        while (numeroUsuario != numero) {
            System.out.println("ingrese el valor del numero secreto");
            numeroUsuario = valor.nextInt();
        }
        if (numeroUsuario == numero){
            System.out.println("Felicitaciones a adivinado el numero secreto que es " + numero);
        }
    }
}

