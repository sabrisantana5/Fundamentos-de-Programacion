/* Dada una cadena de caracteres, escriba una función recursiva que la imprima en orden inverso,
pero agregado un guion antes de cada carácter. Ejemplo:
arbol   -l-o-b-r-a
*/
import java.util.Scanner;
public class Exfinal3
{
	public static void main (String[] args)
	{
		String cadena="";
		Scanner lector = new Scanner(System.in);
		System.out.println("Dime una cadena de caracteres");
		cadena = lector.nextLine();
		recursiva(cadena);
	}
	public static void recursiva(String cadena)
	{
		if(cadena.length()<=1)
			{
				System.out.print("-"+cadena.substring(0,1));
			}
		else
			{
				System.out.print("-"+cadena.substring(cadena.length()-1,cadena.length()));
				recursiva(cadena.substring(0,cadena.length()-1));

			}
	}
}
/*
C:\Users\User\Documents\ITESM\Progra>java Exfinal3
Dime una cadena de caracteres
arbol
-l-o-b-r-a
*/