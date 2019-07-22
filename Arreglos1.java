import java.util.Scanner;

public class Arreglos1
{
	public static void main(String[] args)

	//double numeros[]; //correcto pero no usado
	{
		int[] arreglo = {3,5,8}; //guardado de enteros donde arreglo es el nombre
		int[] arreglo2 = new int[5]; //define un arreglo con 5 elementos, aparta memoria
		int promedio=0;
		int suma=0;
		for (int indice = 0; indice<+arreglo.length; indice++)
		{
			System.out.println(arreglo[indice]);
		}
		System.out.println("Tamanno: "+arreglo.length);

		arreglo2[0] = 95;
		arreglo2[1] = 81;
		arreglo2[2] = 70;
		arreglo2[3] = 100;
		arreglo2[4] = 65;

		for(int i= 0;i<arreglo2.length; i++)
		{
			suma += (double)arreglo2[i];
		}
		System.out.printf("El promedio es %.2f", suma/(double)arreglo2.length);

	}
}