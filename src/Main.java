
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a screen mach");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
     boolean incluidoEnElPlan = true;
     double notaDeLaPelicula = 8.2;

     double media = (8.2 + 6.8 + 9.0)/3;
     System.out.println(media);

     String sinopsis = """
             matrix paradoja de la realidad pero tecnologica
             Fue lanzada en: 
             """ + fechaDeLanzamiento;
     System.out.println(sinopsis);

     int clasificacion;
        clasificacion = (int)notaDeLaPelicula;
        System.out.println(clasificacion);

        int temperatura = 14;

        System.out.println("fahrenheit:" + (temperatura * 1.8)+ 32) ;

    }
}