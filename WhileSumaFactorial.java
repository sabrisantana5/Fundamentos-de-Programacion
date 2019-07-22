//Metodo que recibe parametro entero y de la sumatoria de n+1 y la factorial
import java.util.Scanner;

public class WhileSumaFactorial
{
	public static void main(String[] args)
	{
		int numero;
		Scanner lector = new Scanner(System.in);

		System.out.println("Dime un numero entero");
		numero = lector.nextInt();

		System.out.printf("La sumatoria es %d.%n", sumatoria(numero) );
		System.out.printf("La factorial es %d.", factorial(numero) );
	}

	public static int sumatoria (int num)
	{
		int contador=0;
		int suma=0;
		while (contador<=num)
		{
			suma= suma+ contador;
			contador++;
			}
		return suma;
	}
	public static int factorial (int num)
	{
		int contador=1; //si fuera 0 al multiplicar todo es 0
		int fact=1;
		while (contador<=num)
		{
			fact=fact*contador; //fact*=contador
			contador++;

			}
			return fact;
		}

}
