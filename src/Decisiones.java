public class Decisiones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean enElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";



        if (fechaDeLanzamiento >= 1999){
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Peliculas retro que vale la pena ver");
        }
        if ( tipoPlan.equals("plus") || enElPlan == true ){
            System.out.println("Disfrute la pelicula");
        }else {
            System.out.println("No tiene acceso al plan");
        }



    }
}
