// 7200 revoluciones por minuto gira un disco duro
import java.io.*;

public class LeerArchivo
{
	public static void main(String[] args)	throws IOException
	{
		//String nombreArchivo = "ejemplo1.txt";
		String nombreArchivo = "ejemplo2.csv";
		String datosLeidos;

		FileReader lector = new FileReader(nombreArchivo);
		BufferedReader br = new BufferedReader(lector); //no vuelve a leer el disco completo, lee el bloque del disco

		String arreglo[] = new String[3];

		while((datosLeidos = br.readLine()) !=null)
		{
		System.out.println(datosLeidos);
		arreglo = datosLeidos.split(",");
		System.out.println(arreglo[0]);
		}

		lector.close();
	}
}