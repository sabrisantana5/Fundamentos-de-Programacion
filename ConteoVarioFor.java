/*4. Escribir un programa que visualize la siguiente salida.
Escribe un numero
5

1
12
123
1234
12345
1234
123
12
1
El número n debe ser ingresado por el usuario. */

import java.util.Scanner;
public class ConteoVarioFor
{
	public static void main(String[] args)
	{
		int numo;
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe un numero");
		numo = lector.nextInt();

		for (int cont=1;cont<=numo;cont++)
		{
			for (int conta=1;conta<cont; conta++)
			{

			System.out.print(conta);
			}
		System.out.println();
		}

		for(int cont=numo; cont>=1; cont--)
		{
			for(int conta=1; conta<=cont; conta++)
			{
			System.out.print(conta);
			}
		System.out.println();
		}
	}
}