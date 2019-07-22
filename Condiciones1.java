/********************************
* Ejemplo de uso de condiciones *
* Por Sabrina Santana           *
* Tecnológico de Monterrey      *
* Fundamentos de programación   *
********************************/
import java.util.Scanner;

public class Condiciones1
{
	public static void main(String[] args)
	{
		int temperatura;
		String salida;
		Scanner stdIn = new Scanner(System.in); //stdIn puede ser cualquier variable

		System.out.println("Escribe la temperatura del auto");

		temperatura = stdIn.nextInt(); //lee la temperatura, lee un entero

		if (temperatura>110)//or se escribe ||, and se escribe &&, diferente se escribe !=
		{
			System.out.println("Temperatura muy caliente Por favor detente.");
			System.out.println("Revisa el nivel y temperatura de aceite");
		}
		else if (temperatura<-10)
		{
			System.out.println("Temperatura muy fria. Por favor detente.");
		}
			else
			{
				System.out.println("Temperatura ok, continúa");
			}

		stdIn.nextLine(); //cada que hagas un next int va a leer el "enter" (osea lee nada) por eso se pone
		System.out.println("Escribe s para salir");
		salida =stdIn.nextLine();
		if(salida.equals ("s") || salida.equals ("S") ) //.euqalsIgnoreCase no distingue si es mayuscula o minuscula
		{
			System.out.println("Adiós");
		}
	}
}