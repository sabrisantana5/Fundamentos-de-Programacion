/******************************
* Ejemplo de uso de métodos   *
* Por Sabrina Santana         *
* Tecnológico de Monterrey    *
* Fundamentos de programación *
******************************/
import java.util.Scanner; //IMPORTACION DE LA BIBLIOTECA PARA LEER

public class Metodo1
{
		public static void main (String[] args)
		{
			String nombre = "Sabrina";
			String otroNombre = "Alejandro";

			Scanner lector = new Scanner (System.in); //el lector es una variable que puedes cambiar

			nombre = lector.nextLine(); //reasigna nombre por lo que escanea

			imprime (nombre);

			System.out.println("Entre llamadas al metodo");

			imprime (otroNombre); //Tienes que poner algo a fuerzas adentro String si uno de ellos lo tiene por el string nom de abajo
		}
		public static void imprime (String nom) /*eso es un metodo, equivalente a una funcion, el nom solo es para que el programa
		sepa que va a recibir un string, y pueden ser diferentes*/
		{
			System.out.printf("Hola %s desde el metodo. %n", nom);
		}

}