import java.io.*;//io input output, esto genera un prototipo llamado file
public class EscribirArchivo
{
	public static void main(String[] args) throws IOException //file exige que se pueda cachar una excepcion
	{
		File archivo;
		String nombreArchivo = "ejemplo1.txt";

		archivo = new File(nombreArchivo); //crea un archivo de texto en donde esta guardado el programa
		archivo.createNewFile();

		FileWriter escritor = new FileWriter(archivo, true); //abre el archivo para agregar,vuelve a escribir lo que tenias

		// NO USAR ASI escritor.write("Ejemplo de archivo.");

		PrintWriter pw = new PrintWriter(escritor); //escribe con formato printf
		pw.printf("Ejemplo de archivo con formato.%nNumero %d",1218);

		escritor.close(); //si no se queda abierta la exclusividad
	}
}

