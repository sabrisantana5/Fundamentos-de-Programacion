/******************************
* Ejemplo de uso de métodos   *
* Por Sabrina Santana         *
* Tecnológico de Monterrey    *
* Fundamentos de programación *
******************************/
import java.util.Scanner;

public class Metodo2
{
	public static void main (String[] args)
	{
		double numero1 = cuadrado (5.0);
		System.out.printf ("El cuadrado de %f es %f. %n", 4.0, cuadrado (4.0));
		System.out.printf ("%.2f", numero1); // el .2 es la cantidad de decimales
		imprimeHola();
	}

	public static double cuadrado (double num)
	{
		double cuadrado;
		cuadrado = num*num;
		return cuadrado;
	}
	public static void imprimeHola ()
	{
		System.out.printf("Hola a todos");
	}
}