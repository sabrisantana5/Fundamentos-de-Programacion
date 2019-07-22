//Calcular la suma de los primeros 50 numeros enteros [1275]
//Incluye 3 ejemplos: For, While y DoWhile
public	class	Ej1For
{
	public	static	void	main	(String[]args)
	{
	int	sum=0;
		for	(int	n=1;n<=50;n++)
		{
			sum=sum+n;
		}
System.out.println("La	suma de	los primeros 50	numeros	enteros	es de: "+sum);
	}
}

public	class	Ej1While
{
		public	static	void	main(String[]	args)
		{
				int	n=0,	sum=0;
				while(n<=50)
				{
						sum=sum+n;
						n++;
				}
				System.out.println("La	suma	de	los	primeros	50	numeros	enteros	es	de:	"+sum);
		}
}

public	class	Ej1dowhile
{
		public	static	void	main(String[]args)
		{
				int	sum=0,	n=0;
				do	{
						sum=sum+n;
						n++;
				}	while	(n<=50);
				System.out.println("La	suma	de	todos	los	numeros	enteros	hasta	el	50	es	de:	"+sum);
		}
}