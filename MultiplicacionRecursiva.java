/********************************
* Ejercicio 3 Examen 			*
* Por Sabrina Santana           *
* Tecnol�gico de Monterrey      *
* Fundamentos de programaci�n   *
********************************/
/*
Escriba una funcion recursiva que devuelva la multiplicaci�n de los elementos de un arreglo de enteros.
El usuario debe introducir el tama�o del arreglo y los n�meros.

-Sugerencia: use como prototipo de la funci�n int mutiplicacionRecursiva(int[] arreglo, int size)
� genere un arreglo nuevo dentro de la funci�n para solo llamar usar int mutiplicacionRecursiva(int[] arreglo).
*/
import java.util.Scanner;
public class MultiplicacionRecursiva
{
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);

		int n;

		System.out.println("De que tama�o deseas el arreglo?");
			n=lector.nextInt();

		int[] arreglo = new int[n];

		for(int i = 0;i<n;i++)
		{
			System.out.printf("Dime el valor entero la posicion %d del arreglo: ",i);
			arreglo[i] = lector.nextInt();
		}

			multiplicacionrecursiva(arreglo);
			System.out.println(arreglo);

	}

			public static int multiplicacionrecursiva(int[] arreglo)

			{
				int indice = arreglo.length;

				if(indice==0)
				   return arreglo[0];
				else
					return arreglo[indice]*multiplicacionrecursiva(arreglo , indice-1);
			}

}

