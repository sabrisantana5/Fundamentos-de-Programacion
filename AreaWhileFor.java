//Calcular el area de un cuadrado pero que el programa pregunte si quiero terminar o volverlo a hacer
import java.util.Scanner;

public class AreaWhileFor
{
	public static void main(String[] args)
	{
		double lado;
		String respuesta;
		Scanner lector = new Scanner(System.in);
		//respuesta = "si"; //si no ponemos esto el while no empieza y el ciclo no se cumple

		//do
		for(respuesta = "si";!respuesta.equalsIgnoreCase("no");)
		{
			System.out.println("Dame el lado de un cuadrado para calcular su area");
			lado = lector.nextDouble(); //cuando haces next agarra el siguiente enter mientras no sea string
			lector.nextLine();

			System.out.printf("El area es %.2f %n", lado*lado);

			System.out.println("Quieres hacerlo de nuevo (si) (no) ");
			respuesta = lector.nextLine();//.toLowerCase(); compara aunque sea minuscula o mayuscula
		} // while(!respuesta.equalsIgnoreCase("no")); //el ! es para que sea mientras no, negacion de buleano
		System.out.println("Gracias");
	}
}