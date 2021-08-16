import java.util.Scanner;

/**
 * <p> 
 * Descripcion: En el driver podemos generar un amigo, un perro y acceder al menu para realizar otra accion.
 * Al encontrar al perro el programa se cerrara
 * </p>
 * <p>En el driver encontraremos las siguientes posibles acciones</p>
 * <ul>
 * <li>Crear un nuevo amigo o amiga</li>
 * <li>Crear un nuevo perro</li>
 * <li>Llamar a la perrera</li>
 * <li>Imprimir y colocar un anuncio en la ciudad</li>
 * <li>Publicar un anuncio en el periodico local</li>
 * <li>Mostrar el dinero restante del amigo o amiga</li>
 * <li>Salir y cerrar el programa</li>
 * 
 * </ul>
 * @author Sebastian Estrada Tuch
 * @since 15/08/2021
 * @version 1.0
*/
import java.util.Random;
import java.util.Scanner;
class Busqueda{
	/**
	 * En el metodo main se genera el menu y le damos la opcion al usuario de escoger
	 * lo que desea realizar
	 * @param args
	 */
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Amigo amigo = new Amigo(); // declaro amigo
		Perro perro = new Perro(); // Declaro un perro
		int opcion = 0;// El valor de opcion a cambiar
		
		while (opcion != 7){
			System.out.println("\n\nBienvenido al simulador de entrenamiento de voluntari@s. ¿Que hara?");
			System.out.println("1. Nuevo amigo");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Llamar a la perrera");
			System.out.println("4. Imprimir anuncio");
            System.out.println("5. Publicar anuncio en el periodico local");
            System.out.println("6. Dinero restante");
			System.out.println("7. Salir\n\n");
			
			opcion = scan.nextInt(); // Cambio la variable opcion para el menu
			
			if (opcion == 1){
				amigo = new Amigo(); // Creo un nuevo amigo
			} else if (opcion == 2){
				perro = new Perro(); // Creo un nuevo perro
			} else if (opcion == 3){
				amigo.llamarPerrera(perro); // Llama a la perrera
				opcion = amigo.getOpcion();
			} else if (opcion == 4){
				amigo.imprimitAnuncio(perro); // Imprime anuncio
				amigo.publicarAnuncio(perro); // Publica anuncio
				opcion = amigo.getOpcion();
			} else if (opcion == 5){
				amigo.anuncioPeriodico(perro); // Publicar anuncio en el periodico
				opcion = amigo.getOpcion();
			} else if (opcion == 6){
                amigo.dineroRestante(); // Dinero restante
            } else if (opcion == 7){
                // Cerrar el programa
            }
		}
	}
}