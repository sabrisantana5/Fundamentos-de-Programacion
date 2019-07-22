//Escribir un programa que te diga la el valor del codigo de la posicion de una letra
public class CodePoint1
{
	public static void main(String[] args)
	{
		String str;
		int val;

		str = "Niño";
		val = str.codePointAt(2);

		System.out.printf("El CodePoint es %d %n", val);
		System.out.printf("El CodePoint es %d %n", str.codePointAt(1));

		System.out.printf("El char es "+ str.charAt(2));
	}
}