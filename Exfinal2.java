/*hacer un programa de mensajes secretos
 El programa debe recibir una frase de hasta 50 caracteres, y un c�digo de hasta 5 n�meros del 1 al 9.
 El programa debe tomar el c�digo UNICODE de la primera letra del p�rrafo, y sumarlo con el primer n�mero del c�digo
 y as� sucesivamente hasta generar el c�digo oculto. Cuando se acaben los n�meros del c�digo de deben repetir a partir del primero.
 Si se programa adicionalmente la opci�n para descifrar el c�digo oculto dando el c�digo num�rico, se obtendr�n 5 puntos extra.
 */
import java.util.Scanner;
public class Exfinal2
{
	public static void main (String[] args)
	{
		int c,unicode1,unicode2,j=0;
		char u1,u2,secreto;
		String frase,codigo;
		Scanner lector = new Scanner(System.in);
		System.out.println("Dime una frase de hasta 50 caracteres");
		frase = lector.nextLine();
		System.out.println("Dime un c�digo de hasta 5 numeros del 1 al 9");
		codigo = lector.nextLine();


		for(int i=0;i<frase.length();i++)
		{
		u1 = frase.charAt(i);
		unicode1 = (int) u1;
		u2 = codigo.charAt(j);
		unicode2 = (int) u2;
		j++;
		c = unicode1+unicode2;

		secreto= (char) c;


		if(j==5)
		{
			j=0;
		}
		System.out.printf("%c es %d y %c es %d , ",u1,unicode1,u2,unicode2);
		System.out.printf("La suma de sus unicodes es el sig num oculto: %d con la letra : %c %n",c,secreto);
		}
	}
}
/* C:\Users\User\Documents\ITESM\Progra>java Exfinal2
Dime una frase de hasta 50 caracteres
Hola soy sabri
Dime un c�digo de hasta 5 numeros del 1 al 9
12345
H es 72 y 1 es 49 , La suma de sus unicodes es el sig num oculto: 121 con la letra : y
o es 111 y 2 es 50 , La suma de sus unicodes es el sig num oculto: 161 con la letra : �
l es 108 y 3 es 51 , La suma de sus unicodes es el sig num oculto: 159 con la letra : ?
a es 97 y 4 es 52 , La suma de sus unicodes es el sig num oculto: 149 con la letra : ?
  es 32 y 5 es 53 , La suma de sus unicodes es el sig num oculto: 85 con la letra : U
s es 115 y 1 es 49 , La suma de sus unicodes es el sig num oculto: 164 con la letra : �
o es 111 y 2 es 50 , La suma de sus unicodes es el sig num oculto: 161 con la letra : �
y es 121 y 3 es 51 , La suma de sus unicodes es el sig num oculto: 172 con la letra : �
  es 32 y 4 es 52 , La suma de sus unicodes es el sig num oculto: 84 con la letra : T
s es 115 y 5 es 53 , La suma de sus unicodes es el sig num oculto: 168 con la letra : �
a es 97 y 1 es 49 , La suma de sus unicodes es el sig num oculto: 146 con la letra : ?
b es 98 y 2 es 50 , La suma de sus unicodes es el sig num oculto: 148 con la letra : ?
r es 114 y 3 es 51 , La suma de sus unicodes es el sig num oculto: 165 con la letra : �
i es 105 y 4 es 52 , La suma de sus unicodes es el sig num oculto: 157 con la letra : ?
*/