import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escribe el nombre de tu peli favorita");
    String pelicula = teclado.nextLine();
    System.out.println("ahora la fecha de lanzamiento");
    int fechaDeLanzamiento = teclado.nextInt();
    System.out.println("que puntaje le das a la pelicula");
    double puntaje = teclado.nextDouble();


        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(puntaje);
    }

}
