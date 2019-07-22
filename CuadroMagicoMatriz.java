//cuadro magico
import java.util.Scanner;
public class CuadroMagicoMatriz
{
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		int n, renglon=0, columna=0;

		System.out.println("Escoge un numero impar entre 3 y 11 para crear el cuadro magico");
				n = lector.nextInt();

			int[][] matriz = new int[n][n];
			int medio;
			medio = (((n+1)/2)-1);
			renglon = 0;
			columna = medio;
			matriz[renglon][columna] = 1;

			if (n%2 == 1)
		{
			for (int i = 2;i<(n*n)+1;i++)
			{
				if (columna==n-1)
				{
					if(renglon==0)
					{
						renglon +=1;
						columna=n-1;
						matriz[renglon][columna] = i;
					}
					else
					{
					columna = 0;
					renglon -= 1;
						matriz[renglon][columna] = i;
					}
				}
				else if (renglon==0)
				{
				renglon = n-1;
				columna += 1;

					matriz[renglon][columna] = i;
				}

				else
				{
					if (matriz[renglon-1][columna+1]==0)
					{
						renglon-=1;
						columna+=1;
						matriz[renglon][columna] = i;


					}
					else
					{	renglon += 1;
						matriz[renglon][columna] = i;
					}
				}
			}
						      for (int i=0; i<n; i++)
						      {
						         for (int j = 0; j<n; j++)
						         {
						            System.out.print("["+matriz[i][j]+"]");
						         }
						         System.out.println();
			     			 }
		}

			else
			{
				System.out.println("El numero es par");
			}


	}
}


			//constante magica= [n * (n2 + 1)]