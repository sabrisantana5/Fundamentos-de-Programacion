import java.util.Scanner; //biblio

public class EntradaScanner
{
	public static void main(String[] args)
	{
		String nombre;
		Scanner stdIn = new Scanner(System.in); //stdIn es una variable cualquiera, permite leer del teclado

		nombre = stdIn.nextLine(); //permite leer del teclado el texto y lo pone en la variable nombre
		System.out.println("Hola "+nombre);
	}
}