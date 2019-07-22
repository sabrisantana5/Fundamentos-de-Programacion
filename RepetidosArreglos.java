//3. Escribir un programa en Java que encuentre los elementos repetidos en un arreglo.
import java.util.Scanner;

public class RepetidosArreglos
{
	public static void main(String[] args)
	{
			Scanner lector = new Scanner(System.in);
			int[] arreglo = {8,5,-14,7,9,2,20,-5,2,7};

			for (int c = 0;c<arreglo.length;c++)
			{ for (int d=c+1;d<arreglo.length;d++)

				if ((arreglo[c] == arreglo[d])&&(c!=d))
					{
						System.out.printf("Elemento repetido %d %n", arreglo[c]);
					}
			}
		}
}
/*C:\Users\User\Documents\ITESM\Progra>java Ej3Arreglos
Elemento repetido 7
Elemento repetido 2 */