//2. Escribir un programa que busque un elemento en un arreglo. (Es decirsi se busca el valor 5, que el programa diga en que posición del arreglo se encuentra).
import java.util.Scanner;

public class BuscarValorArreglos
{
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		int elemento,encontrado=0;
		int[] arreglo = {8,5,-14,7,9,2,20,-5,2,7};

		System.out.println("Que elemento quieres  buscar en el arreglo?");
		elemento = lector.nextInt();


		for (int contador = 0;contador<arreglo.length;contador++)
		{
			if (arreglo[contador] == elemento)
				{
					encontrado=1;
					System.out.printf("Esta en la posicion: %d %n", contador);
				}
		}
			if (encontrado==0)
				{
					System.out.println("El elemento no se encuentra en el arreglo");
				}

	}
}
/* C:\Users\User\Documents\ITESM\Progra>java Ej2Arreglos
Que elemento quieres  buscar en el arreglo?
56
El elemento no se encuentra en el arreglo

C:\Users\User\Documents\ITESM\Progra>java Ej2Arreglos
Que elemento quieres  buscar en el arreglo?
2
Esta en la posicion: 5
Esta en la posicion: 8 */