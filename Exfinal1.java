/* Hacer un programa que emule un juego de adivinar el n�mero. El programa debe generar un n�mero aleatorio entre 1 y 100
(sin mostrarlo al usuario), y el usuario debe introducir un n�mero para intentar adivinar el n�mero.
El programa debe responder con �Mi n�mero es menor�, �Mi n�mero es mayor� o �Has adivinado el n�mero�.
Solo se deben dar 8 oportunidades. Si se acaban las oportunidades, el programa deber decir �Se te han acabado las oportunidades.
El n�mero era � y se deber� mostrar el n�mero generado. Sugerencia: use la biblioteca java.util.Random */
import java.util.Random;
import java.util.Scanner;
public class Exfinal1
{
	public static void main (String[] args)
	{
		Random numerosAleatorios = new Random();
		Scanner lector = new Scanner(System.in);
		int numero;
		int n;
		int adivinado=0;

		numero = numerosAleatorios.nextInt(100)+1;
		System.out.println("Adivina el n�mero que eleg� de 0 a 100");

		for(int oportunidad=1;oportunidad<=8&&adivinado!=1;oportunidad++)
		{
			n=lector.nextInt();
			if(n<numero)
			{
			System.out.println("Mi numero es mayor");
			} else if (n>numero)
			{
			System.out.println("Mi numero es menor");
			} else
			{
				System.out.println("Haz adivinado el numero");
				adivinado=1;
			}
		}
					if (adivinado==0)
					{
						System.out.printf("Se te han acabado las oportunidades. El n�mero era %d",numero);
					}

	}
}
/* C:\Users\User\Documents\ITESM\Progra>java Exfinal1
Adivina el n�mero que eleg� de 0 a 100
50
Mi numero es menor
40
Mi numero es mayor
45
Haz adivinado el numero
C:\Users\User\Documents\ITESM\Progra>java Exfinal1
Adivina el n�mero que eleg� de 0 a 100
50
Mi numero es menor
35
Mi numero es menor
30
Mi numero es menor
29
Mi numero es menor
28
Mi numero es menor
27
Mi numero es menor
26
Mi numero es menor
25
Mi numero es menor
Se te han acabado las oportunidades. El n�mero era 15*/
