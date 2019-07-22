/*
Escriba una programa que sume dos matrices, y se guarde en una tercera matriz. La matriz es de tamaño NxM,
donde los valores N y M se deben pedir al usuario, así como los valores de las matrices.
*/
import java.util.Scanner;
public class SumaMatrices
{
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		int n,m;

		System.out.println("Dime el valor de N");
			n = lector.nextInt();
		System.out.println("Dime el valor de M");
			m = lector.nextInt();

			int[][] matriz1 = new int[n][m];
			int[][] matriz2 = new int[n][m];
			int[][] matriz3 = new int[n][m];

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.printf("Dame el valor de la coordenada %d , %d de la Matriz1: ",i,j);
				matriz1[i][j] = lector.nextInt();
			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.printf("Dame el valor de la coordenada %d , %d de la Matriz2: ",i,j);
				matriz2[i][j] = lector.nextInt();
			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];

				System.out.printf("(%d)\t",matriz3[i][j]);
			}
			System.out.println();
		}


	}

	/*
	C:\Users\User\Documents\ITESM\Progra>java Ej2Examen
	Dime el valor de N
	3
	Dime el valor de M
	2
	Dame el valor de la coordenada 0 , 0 de la Matriz1: 1
	Dame el valor de la coordenada 0 , 1 de la Matriz1: 2
	Dame el valor de la coordenada 1 , 0 de la Matriz1: 3
	Dame el valor de la coordenada 1 , 1 de la Matriz1: 4
	Dame el valor de la coordenada 2 , 0 de la Matriz1: 5
	Dame el valor de la coordenada 2 , 1 de la Matriz1: 6
	Dame el valor de la coordenada 0 , 0 de la Matriz2: 7
	Dame el valor de la coordenada 0 , 1 de la Matriz2: 8
	Dame el valor de la coordenada 1 , 0 de la Matriz2: 9
	Dame el valor de la coordenada 1 , 1 de la Matriz2: 10
	Dame el valor de la coordenada 2 , 0 de la Matriz2: 11
	Dame el valor de la coordenada 2 , 1 de la Matriz2: 12
	(8)     (10)
	(12)    (14)
    (16)    (18)
*/
}
