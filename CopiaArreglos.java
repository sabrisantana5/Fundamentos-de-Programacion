// 1. Escribir un programa en Java que copie un arreglo en otro usando ciclos.
import java.util.Scanner;
public class CopiaArreglos
{
	public static void main(String[] args)
	{
				Scanner lector = new Scanner(System.in);
				int elemento;
				int[] arreglo1 = {8,5,-14,7,9,2,20,-5,2,7};
				int[] arreglo2 = new int [arreglo1.length];

				for (int contador = 0;contador<arreglo1.length;contador++)
				{
					arreglo2[contador] = arreglo1[contador];
						{
							System.out.printf("Numero pasado del arreglo 1 al arreglo 2: %d %n", arreglo2[contador]);
						}
				}

			}
}
/*C:\Users\User\Documents\ITESM\Progra>java Ej1Arreglos
Numero pasado del arreglo 1 al arreglo 2: 8
Numero pasado del arreglo 1 al arreglo 2: 5
Numero pasado del arreglo 1 al arreglo 2: -14
Numero pasado del arreglo 1 al arreglo 2: 7
Numero pasado del arreglo 1 al arreglo 2: 9
Numero pasado del arreglo 1 al arreglo 2: 2
Numero pasado del arreglo 1 al arreglo 2: 20
Numero pasado del arreglo 1 al arreglo 2: -5
Numero pasado del arreglo 1 al arreglo 2: 2
Numero pasado del arreglo 1 al arreglo 2: 7*/