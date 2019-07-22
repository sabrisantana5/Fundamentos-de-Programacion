import java.util.Random;

public class Aleatorios
{
	public static void main(String[] args)
	{
		Random numerosAleatorios = new Random(); /*pone una semilla y entonces sale el mismo numero,
		si esta vacio busca otra semilla, puedes ponerle algo como la hora para que si cambie*/
		int numero;
		for (int i = 1;i<=50;i++) //saca 50 valores aleatorios
		{
		numero = numerosAleatorios.nextInt(21)-10; //va del -10  que es donde empieza al 10 porque tiene el 0
		System.out.print(" "+numero); /*al poner nextint el algoritmo sig cambia,
		y solo tenemos 1 semilla (si pones uno antes), el 10 es para limitar de 0 a <10*/
		}
		double numeroDouble;
		for (int i = 1;i<=50;i++)
		{
			numeroDouble = numerosAleatorios.nextDouble()*10;/*nextdouble no lleva argumentos,
			va desde 0.0 incluye a 1.0 exclusivo, por eso multiplica poor 10 */
			System.out.printf("%.3f ",numeroDouble);
		}
	}
}