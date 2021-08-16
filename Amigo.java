
/**
 * En esta clase se declara toda la informacion necesaria de contacto de las personas
 * que buscan a sus perros y su presupuesto
 * 
 * @author Sebastian Estrada Tuch
 * @since 15/08/2021
 * @version 1.0
 */
import java.util.Random;
import java.util.Scanner;
class Amigo {
    Random rand = new Random(); // Se declara la variable para generar datos al azar
    Scanner scan = new Scanner(System.in); // Se declara la variable para leer y guardar los Strings de las demas variables
    private String nombre; // Se declara una variable que guarda el nombre
    private String numTel; // Se declara el numero de telefono de la persona
    private String direccion; // Se declara la direccion de la persona
    private int dinero; // Se declara la cantidad de dinero que tiene la persona

    private int opcion = 0; // Se declara la opcion que el usuario quiere para el menu

    private String recompensa; // Se declara la recompensa que el usuario esta dispuesto a pagar para el rescate del perro

    /**
     * Este es el metodo constructor se declara mediante el scanner los valores de todas sus propiedades
     * y se muestra el dinero que el amigo tiene disponible
     */
    public Amigo() {
        dinero = rand.nextInt(1000);
        System.out.println("\n¿Cual es su nombre?: \n");
        nombre = scan.nextLine();
        System.out.println("\n\n¿Cual es su numero telefonico?: \n");
        numTel = scan.nextLine();
        System.out.println("\n\n¿Cual es su direccion?: \n");
        direccion = scan.nextLine();


        System.out.println("\n\nMi capacidad econocmica para buscar a mi perro es de " + dinero);
    }

    /**
     * En este metodo se utiliza la suerte que tiene el perro para ver si la perrera
     * encontro al perro del usuario o no
     * @param p
     */
    public void llamarPerrera(Perro p){
        int suerte = p.getSuerte();

        if (suerte < 5){
            System.out.println("Ya llevaron a su perro");
            opcion = 7;
        }else if (suerte > 5){
            System.out.println("No llevaron a su perro");
        }

    }

    /**
     * En este metodo imprimimos el anuncio de busqueda del perro con su informacion
     * y la informacion del amigo
     * @param P
     */
    public void imprimitAnuncio (Perro p){
        
        if (dinero >= 25){
            System.out.println("\n\n¿Que recompensa quiere ofrecer?\n\n");
            recompensa = scan.nextLine();

            System.out.println("El anuncio se mostrara de la siguiente forma: \n" + 

                            "SE BUSCA A PERRO QUE RESPONDE AL NOMBRE DE \n" + 
                            p.getNombre() + "\n" +
                            "es " + p.getHembraMacho() + "\n" +
                            "de color " + p.getColor() + "\n"+
                            "de raza " + p.getRaza() + "\n" + 
                            "que tiene la siguiente caracteristica especial: \n" + 
                            p.getOtraCaract() + "\n" +

                            "             __     \n" +
                            " (),--------'()'--o \n" + 
                            "  (_    ___    /~   \n" +
                            "   (_)_)  (_)_)     \n" +

                            "\n cualquier informacion contactar con \n" +
                            nombre + "\n" + 
                            "al numero: " + numTel + "\n" +
                            "Si lo tiene llevar a la siguiente direccion \n" +
                            direccion + "\n" +

                            "\nLa recompensa es de Q" + recompensa + "\n\n\n");
            dinero = dinero -25;
        }else if (dinero < 25){
            System.out.println("\n\n No tienes suficiente dinero para imprimir el anuncio\n\n");
        }
    }

    /**
     * En este metodo se utiliza la suerte del perro para mostrar si mediante el anuncio que imprimio la persona
     * se encontro o no el perro del amigo
     * @param p
     */
    public void publicarAnuncio(Perro p){
        int suerte = p.getSuerte();

        if (suerte < 10){
            System.out.println("\n\nSu perro se ha encontrado");
            opcion = 7;
        }else if (suerte > 10){
            System.out.println("\n\nSu perro sigue perdido");
        }
    }


    /**
     * En este metodo se muestra la llamada tras publicar el anuncio en el periodico local 
     * y mediante la suerte del perro la persona indica si la persona que ha llamado lo encontro
     * o no.
     * @param p
     */
    public void anuncioPeriodico (Perro p){
        int suerte = p.getSuerte();

        if (dinero >= 125){
            System.out.println("Trrrrrrrr ...\n" + 
                                "TRRRRRRRRRR ...\n" + 
                                "TRRRRRRRRRRRRRRRRRR ...\n" + 
                                "- Halo?? ¿Quien habla?\n" + 
                                "- Hola joven vi el anuncio en el periodico\n");
            if (suerte < 15 ){
                System.out.println("  Y le queria comentar que encontre a este perro\n" + 
                                    "- Muchas gracias lo podrias traer a la direccion: \n" + 
                                    direccion);
                opcion = 7;

            }else if (dinero > 15){
                System.out.println("  Creo que cerca de mi casa vi un pato muy bonito.");
            }
            dinero = dinero - 125;
        }else if (dinero < 125){
            System.out.println("No tienes suficiente dinero para pagar un anuncio en el periodico");
        }

    }
    /**
     * En este metodo se imprime en consola lo restante del dinero que tiene el amigo
     */
    public void dineroRestante(){
        System.out.println("\n\nEl dinero restante es Q"+dinero);
    }

    /**
     * En este metodo se retorna el valor que tiene opcion
     * @return retorna el valor que tiene la variable opcion
     */
    public int getOpcion(){
        return opcion;
    }

}