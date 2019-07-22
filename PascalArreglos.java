/* 3. Escribir un programa que permita visualizar el tri�ngulo de Pascal hasta un renglon dado por el usuario, usando arreglos de arreglos.
En el tri�ngulo de Pascal cada n�mero es suma de los dos n�meros situaros encima de �l. Este problema se debe resolver utilizando un arreglo de arreglos. */
import java.util.Scanner;
public class PascalArreglos
{
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		int renglon;

		System.out.println("Hasta que renglon deseas calcular el tri�ngulo de Pascal? ");
		renglon = lector.nextInt();

	System.out.println(" ");
	int[] arreglo1 = new int[1];
		for (int i = 1; i <= renglon; i++)
		{
			for(int k=i-(renglon/2);k<= renglon;k++)
			{
			System.out.print(" ");
			}
			int[] arreglo2 = new int[i];
				for (int j = 0; j < i; j++)
				{
					if (j == 0 || j == (i - 1))
					{
						arreglo2[j] = 1;
					}
					else
					{
					arreglo2[j] = arreglo1[j] + arreglo1[j - 1];
					}
			System.out.print(arreglo2[j] + " ");
				}
					arreglo1 = arreglo2;
					System.out.println();
		}
	}
}

/*
C:\Users\User\Documents\ITESM\Progra>java Ej3Arreglos2
Hasta que renglon deseas calcular el tri�ngulo de Pascal?
5

       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
*/




