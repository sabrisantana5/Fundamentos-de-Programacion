//arreglo de 10x10 y llenarlo con numeros aleatorios del 1 al 7
import java.util.Random;

public class Arreglodiez
{
	public static void main(String[] args)
	{
		Random numerosAleatorios = new Random();
		int matriz[][] = new int[10][10];
		int suma= 0, mayor=0;
		int posicion[][] = new int[1][2];

		for(int contador = 0;contador<10;contador++)
		{
			for (int enumerador = 0;enumerador<10;enumerador++) //saca el tamaño de la dimension de la segunda dimension
			{
			matriz [contador][enumerador] = numerosAleatorios.nextInt(100)+1;
			System.out.printf("%d\t",matriz[contador][enumerador]);
			}
			System.out.println();
		}

		for(int contador = 0;contador<9;contador++)
		{
			for (int enumerador = 0;enumerador<9;enumerador++)
			{
			suma = matriz[contador][enumerador] + matriz [contador][enumerador+1] + matriz[contador+1][enumerador] + matriz [contador+1][enumerador+1];

			if (mayor<suma)
				{
				mayor = suma;
				posicion[0][0] = contador;
				posicion[0][1] = enumerador;
				}
			}
		}
		System.out.printf("La suma mayor entre cada 4 coordenadas es: %d %n",mayor);
		System.out.println("Las coordenadas son: ");
		System.out.println(posicion[0][0] + "," + posicion[0][1]);
		System.out.println(posicion[0][0] + "," + (posicion[0][1]+1));
		System.out.println((posicion[0][0]+1) + "," + posicion[0][1]);
		System.out.println((posicion[0][0]+1) + "," +(posicion[0][1]+1));

	}
}