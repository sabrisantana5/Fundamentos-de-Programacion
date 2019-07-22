/******************************
* Ejemplo de uso de switch    *
* Por Sabrina Santana         *
* Tecnológico de Monterrey    *
* Fundamentos de programación *
******************************/
import java.util.Scanner;

public class Condiciones3
{
	public static void main (String[] args)
	{
		Scanner lector = new Scanner(System.in);
		int opcion;

		System.out.println("Escribe el numero que quieres verificar del 0 al 10");
		opcion = lector.nextInt();

		switch( opcion)
		{
			case 2: case 3: case 5: case 7:
				System.out.println("Primo");
				break;
			case 0: case 1: case 4: case 6: case 8: case 9: case 10:
				System.out.println("No primo");
				break;
			default:
				System.out.println("Esa opcion no existe");
		}
   }
}