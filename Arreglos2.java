//crear un programa que calcule n calificaciones que se guarden en un arreglo y hagan el promedio
import java.util.Scanner;

public class Arreglos2
{
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		int numero,indiceCambiar;

		System.out.println("Cuántas calificaciones deseas calcular para el promedio");
		numero = lector.nextInt();
		double[] calificaciones = new double[numero];

		for (int conta=0;conta<numero;conta++) //conta<arreglo.length
		{
		System.out.printf("Dime la calificacion %d :", conta+1);
		calificaciones[conta] = lector.nextDouble();
		}
		muestraArreglo(calificaciones);

		System.out.println("Quieres cambiar una calificacion? Cual?(-1 para salir)");
		indiceCambiar = lector.nextInt();

		if (indiceCambiar!=-1)
		{
		System.out.println("Cual es la calificacion?");
		calificaciones[indiceCambiar-1] = lector.nextDouble();
		muestraArreglo(calificaciones); //metodo
		}
	}
		public static void muestraArreglo(double[] arreglo) //esta recibiendo calificaciones con la palabra arreglo
	{
				double suma=0;
				for (int conta=0;conta<arreglo.length;conta++) //si pones numero no lo lee porque es un metodo
				{
					System.out.printf("Tus calificaciones son %.2f : %n", arreglo[conta]);
					suma+=arreglo[conta];
				}
		System.out.printf("El promedio es %.2f :", suma/arreglo.length);
	}

}