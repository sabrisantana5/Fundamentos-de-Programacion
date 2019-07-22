/* Hacer un programa que emule un juego de adivinar el número. El programa debe generar un número aleatorio entre 1 y 100
(sin mostrarlo al usuario), y el usuario debe introducir un número para intentar adivinar el número.
El programa debe responder con “Mi número es menor”, “Mi número es mayor” o “Has adivinado el número”.
Solo se deben dar 8 oportunidades. Si se acaban las oportunidades, el programa deber decir “Se te han acabado las oportunidades.
El número era “ y se deberá mostrar el número generado. Sugerencia: use la biblioteca java.util.Random */
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
		System.out.println("Adivina el número que elegí de 0 a 100");

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
						System.out.printf("Se te han acabado las oportunidades. El número era %d",numero);
					}

	}
}
/* C:\Users\User\Documents\ITESM\Progra>java Exfinal1
Adivina el número que elegí de 0 a 100
50
Mi numero es menor
40
Mi numero es mayor
45
Haz adivinado el numero
C:\Users\User\Documents\ITESM\Progra>java Exfinal1
Adivina el número que elegí de 0 a 100
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
Se te han acabado las oportunidades. El número era 15*/
