//string imutable que no cambia su tama�o, para hacer operaciones con strings hay que generar nuevos
//cuando hay un replace te devuelve un nuevo string
public class CodePoint2
{
	public static void main(String[] args) //lo que pongas en terminal despues de java genera un arreglo args y recibe
	{
		String str;
		int val;
		String compara = args[0];
		String nuevo;

		str = "Es misi�n del Tecnol�gico de Monterrey formar personas �ntegras, �ticas,con  una visi�n human�stica y competitivas internacionalmente en su campo  profesional,que al mismo tiempo sean ciudadanos comprometidos con el  desarrollo econ�mico, pol�tico, social y cultural de su comunidad y con el uso  sostenible de los recursos naturales.";
		//no pone llaves porque esta en varios renglones

		if(str.contains((compara.toLowerCase()))) //distingue sea may o min
			System.out.println("Existe");
		else
			System.out.println("No existe");

		nuevo = str.replace("personas" , "alumnos"); //formar alumnos �ntegras,
		System.out.println(nuevo);


	}
}
//javac -encoding utf8 CodePoint2.java