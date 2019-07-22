//llenar un arreglo de 100 elementos con numeros aleatorios
import java.util.Random;

public class Aleatorios2
{
	public static void main(String[] args)
	{
		int[] Arreglo = new int[100];
		Random numerosAleatorios = new Random();
		for (int i = 0;i<100;i++)
		{
				Arreglo[i] = numerosAleatorios.nextInt(100)+1;
				System.out.print(" "+Arreglo[i]);

		}
	}
}