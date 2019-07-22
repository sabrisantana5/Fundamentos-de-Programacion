public class VariablesNombre
{	public static void main(String[] args)
	{
	char inicialNombre, inicialApellido;
	char codigoControl;
	//int, long
	//double, floate
	//char, String

	inicialNombre= 'S' ;
	inicialApellido = 'S';
	codigoControl = '\n'; // \t
	// \es para un caracter especifico que normalmente no te deja poner
	// \t es para un tab
	// \n para un enter
	// \r retorno de carro
	String texto = "Mi Nombre es ";
	System.out.println("Hola "+inicialNombre);
	System.out.println("Codigo: "+codigoControl);
	System.out.println("Hola de \t nuevo \r"+inicialApellido);
	System.out.println("\\");//pone solo una de las dos
	System.out.println("Los caracteres de texto son "+texto.length()); //tiene 13 caracteres del 0 al 12 entonces en charAt puedes poner hasta el 12
	System.out.println("El caracter en 5 es "+texto.charAt (5));

	}
}