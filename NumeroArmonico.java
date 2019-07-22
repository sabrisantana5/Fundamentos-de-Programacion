/*
En matem�ticas, se define el n-�simo n�mero arm�nico como la suma de los rec�procos de los primeros n n�meros naturales:

N�meros arm�nicos

Escriba una programa que muestre el n-�simo n�mero arm�nico (n dado por el usuario) usando un ciclo WHILE.
*/
import java.util.Scanner;
public class NumeroArmonico
{
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		int n;
		double contador=1;
		double valor, total=0;

		System.out.println("Escoge el numero hasta el que deseas sumar");
		n = lector.nextInt();

		while (contador<=n)

		{
			valor = (1/contador);
			total = total + valor;
			contador++;
		}

		System.out.printf("El n-esimo numero armonico es: %.2f", total);

	}
}
/* C:\Users\User\Documents\ITESM\Progra>java Ej1Examen
Escoge el numero hasta el que deseas sumar
5
El numero armonico es: 2.28 */
