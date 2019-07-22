//de 100 en descendente a lo que el usuario diga
import java.util.Scanner;

public class ConteoWhileUsuario
{
	public static void main(String[] args)
	{
		int contador=100;
		int numero;
		Scanner lector = new Scanner(System.in);
		System.out.println("Dime un numero entero menor a 100");
		numero = lector.nextInt();

		while(contador>=numero)
		{
		System.out.printf("Conteo: %d%n", contador);
		contador--;
		}
    }
}