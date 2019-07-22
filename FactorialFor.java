//2. Calcular el factorial de un número leido desde el teclado utilizando la sentencia for.
import java.util.Scanner;
public class FactorialFor
{
	public static void main(String[] args)
	{	int num;
		int fact=1;

		Scanner lector = new Scanner(System.in);

		System.out.println("Escribe un numero");
		num= lector.nextInt();

		for(int cont=1;cont<=num; cont++)
		{
		fact*=cont;
		}
		System.out.printf("El factorial es %d",fact);
	}
}
