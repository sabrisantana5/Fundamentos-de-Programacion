public class ComparaStrings
{
	public static void main(String[] args)
	{
		String str1="arbol";
		String str2="arbolito";
		String str3="Arboleda";

		int comparacion; //compara la primer letra

			comparacion = str1.compareToIgnoreCase(str2);
			System.out.printf("Comparacion 1 con 2: %d %n", comparacion);

			comparacion = str1.compareToIgnoreCase(str3);
			System.out.printf("Comparacion 1 con 3: %d %n", comparacion);

			comparacion = str3.compareToIgnoreCase(str2);
			System.out.printf("Comparacion 3 con 2: %d %n", comparacion);
	}
}
/* con zapato en str3
C:\Users\User\Documents\ITESM\Progra>java ComparaStrings
Comparacion 1 con 2: -1
Comparacion 1 con 3: -25
Comparacion 3 con 2: 24 */
