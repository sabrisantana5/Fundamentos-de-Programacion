public class JuntaStrings
{
	public static void main(String[] args)
	{
		String[] nombres={"Carlos","García","Gonzales"};
		String lineaCSV;

		lineaCSV = String.join(",",nombres); //que junte los nombres con una coma
		System.out.println(lineaCSV);

		/********SEPARANDO*******/
		String[] separados;

		separados = lineaCSV.split(","); //que donde estan las comas se separen
		System.out.println(separados[0]);
	}
}