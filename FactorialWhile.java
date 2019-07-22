//2. Calcular el factorial de un número leido desde el teclado
import java.util.Scanner;
public class FactorialWhile
{
	public static void main(String[] args)
	{
		double numo;
		double factorial = 1;
		double contador = 1;
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe un numero");
		numo = lector.nextDouble();
		while (contador<=numo)
		{
			factorial = factorial*contador;
			contador++;
		}
				System.out.printf("El factorial es %.2f",factorial);
	}
}