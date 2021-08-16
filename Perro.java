import java.util.Random;
import java.util.Scanner;
/**
 * En esta clase se declara todas las caracteristicas que debera tener el perro
 * con sus returnos y junto con esto la suerte del perro
 * 
 * @author Sebastian Estrada Tuch
 * @since 15/08/2021
 * @version 1.0
 */
class Perro {
    Random rand = new Random(); // Esta variable genera valores pseudoaleatorios
    Scanner scan = new Scanner(System.in); // Esta variable lee todos los valores ingresados
    private String nombre; // Esta variable es la que guarda el nombre del perro
    private String hembramacho; // Esta variable guarda si el perro es hembra o macho
    private String color;// Esta variable guarda el color del perro
    private String raza; // Esta variable guarda la raza del perro
    private String otraCaracteristica; // Esta variable guarda alguna otra caracteristica especial que tenga el perro

    private int suerte = rand.nextInt(20); // Esta variable genera un numero pseudoaleartorio entero entre 0 y 1

    /**
     * Este es el metodo constructor de perro y se declara mediante el scanner los Strings que tienen todas las
     * variables de perro
     */
    public Perro(){
        System.out.println("\n¿Cual es el nombre del perro?\n");
        nombre = scan.nextLine();
        System.out.println("\n¿Es hembra o macho?");
        hembramacho = scan.nextLine();
        System.out.println("\n¿De que color es su perro?\n");
        color = scan.nextLine();
        System.out.println("\n¿De que raza es su perro?\n");
        raza = scan.nextLine();
        System.out.println("\n¿Que caracteristica distintiva tiene su perro?\n");
        otraCaracteristica = scan.next();

    }

    /**
     * Este metodo retorna el valor que tiene suerte
     * @return Retorna el valor que se genero en la variable suerte
     */
    public int getSuerte(){
        return suerte;
    }

    /**
     * Esta variable retorna el string de nombre
     * @return Retorna el String asignado por el usuario que posee la variable nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Este metodo retorna el string que tiene color
     * @return retorna el String asignado del usuario y que posee la variable color
     */
    public String getColor(){
        return color;
    }
    /**
     * Este metodo retorna el string que tiene raza
     * @return Retorna el string asignado del usuario y que posee la variable raza
     */
    public String getRaza(){
        return raza;
    }
    /**
     * Este metodo retorna el string que tiene otraCaracteristica
     * @return Retorna el String asignado por el usuario y que posee la variable de otraCaracteristica
     */
    public String getOtraCaract (){
        return otraCaracteristica;
    }
    /**
     * Este metodo retorna el string que tiene hembramacho
     * @return Retorna el String asignado por el usuario y que posee la variable de hembramacho
     */
    public String getHembraMacho(){
        return hembramacho;
    }

    
}