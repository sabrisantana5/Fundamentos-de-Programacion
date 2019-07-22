/* Programe una solución para conocer su calificación del curso, sabiendo que los dos parciales tienen un peso de 27.5% cada uno,
el proyecto final 15% y el examen final 30%. Se le debe solicitar al usuario la calificación de cada examen o proyecto, y se debe
generar un archivo de texto con la ponderación y la suma final. El archivo deberá tener el siguiente formato (use tabuladores):

90       27.5%     24.75
80       27.5%     22
76       30.0%     22.8
60       15.0%     9
Total:                  78.55
*/
import java.io.*;
import java.util.Scanner;
public class Exfinal4
{
	public static void main (String[] args) throws IOException
	{
				File archivo;
				String nombreArchivo = "Ej4.txt";
				archivo = new File(nombreArchivo);
				archivo.createNewFile();
				FileWriter escritor = new FileWriter(archivo);
				PrintWriter pw = new PrintWriter(escritor);

		double primer,segundo,proyecto,examen,a=27.5,b=15.0,c=30.0,c1,c2,c3,c4,total;
		Scanner lector = new Scanner(System.in);

		System.out.println("Dime la calificacion de tu primer parcial");
		primer = lector.nextDouble();
		System.out.println("Dime la calificacion de tu segundo parcial");
		segundo = lector.nextDouble();
		System.out.println("Dime la calificacion de tu proyecto final");
		proyecto = lector.nextDouble();
		System.out.println("Dime la calificacion de tu examen final");
		examen = lector.nextDouble();
		c1 = ((primer*a)/100);
		c2 = ((segundo*a)/100);
		c3 = ((proyecto*b)/100);
		c4 = ((examen*c)/100);
		total = c1+c2+c3+c4;

		pw.printf(" %.2f \t %.2f  \t %.2f %n %.2f \t %.2f  \t %.2f %n %.2f \t %.2f  \t %.2f %n %.2f \t %.2f  \t %.2f %n ",primer,a,c1,segundo,a,c2,proyecto,b,c3,examen,c,c4);
		pw.printf("El total es: %.2f",total);
		escritor.close();

	}
}
/* C:\Users\User\Documents\ITESM\Progra>java Exfinal4
Dime la calificacion de tu primer parcial
88
Dime la calificacion de tu segundo parcial
95
Dime la calificacion de tu proyecto final
90
Dime la calificacion de tu examen final
90

 88.00 	 27.50  	 24.20
 95.00 	 27.50  	 26.13
 90.00 	 15.00  	 13.50
 90.00 	 30.00  	 27.00
 El total es: 90.83

*/