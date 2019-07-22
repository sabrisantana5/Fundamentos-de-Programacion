//2. Calcular el factorial de un número leido desde el teclado
import java.util.Scanner;
public class FactorialDoWhile
{
	public static void main(String[] args)
	{
		double numo;
		double factorial = 1,
		double contador = 1;
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe un numero");
		numo = lector.nextDouble();
		do	{
			factorial = factorial*contador;
			contador++;
			} while(contador<=numo);

				System.out.printf("El factorial es %.2f",factorial);
	}
}