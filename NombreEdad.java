/******************************
* Programa nombre y edad      *
* Por Sabrina Santana         *
* Tecnol�gico de Monterrey    *
* Fundamentos de programaci�n *
******************************/

import java.util.Scanner;

public class NombreEdad
{
		public static void main (String [] args)

		{
			String nombre;
			int edad;

			Scanner lector = new Scanner (System.in);

			System.out.print("Dime tu nombre: ");
			nombre = lector.nextLine();

			System.out.print("Dime tu edad: ");
			edad = lector.nextInt();

			imprime(nombre, edad);

		}

		public static void imprime(String nom, int age) //publics no lleva ;
		{

		   System.out.printf("Hola mucho gusto %s, tienes %d a�os . %n",nom,age);
		}
}