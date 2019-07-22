/******************************
* Ejemplo de uso de switch    *
* Por Sabrina Santana         *
* Tecnológico de Monterrey    *
* Fundamentos de programación *
******************************/
import java.util.Scanner;

public class Condiciones4
{
	public static void main (String[] args)
	{
		Scanner lector = new Scanner(System.in);
		String zip;
		char codigo;

		System.out.println("Escribe tu zip code");
		zip = lector.nextLine();
		codigo = zip.charAt (0);

		switch ( codigo )
		{
			case '0': case '2': case '3':
				System.out.println("Region este");
				break;
			case '4': case '5': case '6':
				System.out.println("Region centro");
				break;
			case '7':
				System.out.println("Region sur");
				break;
			case '8': case '9':
				System.out.println("Region oeste");
				break;
			default:
				System.out.println("Esa opcion no existe");

	    }
    }
}