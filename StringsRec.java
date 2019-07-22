//Aprendiendo a utilizar strings y recursion.
public class StringsRec
	{
		public static void main(String[] args)
			{
				String nombre = "sabri";
				String parte = nombre.substring(2,4); //br el primero no mayor al segundo xq seria negativo, y el cero no tiene nada
				System.out.println(parte);
				palabras(nombre);
			}

			public static void palabras(String nom)
			{
				if(nom.length()<=1)
				{
					System.out.print(nom+" ");
				}
				else
				{
					System.out.print(nom+" ");
					palabras(nom.substring(0,nom.length()-1));
					System.out.print(nom+" ");
					// sabri sabr sab sa s sa sab sabr sabri

				}
				return; //es mas claro pero puede no estar porque es automatico, ponerlo es para asegurar
			}
	}