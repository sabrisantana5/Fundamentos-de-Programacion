public class ForNumeros
{
	public static void main(String[] args)
	{
		for(int i = 1; i<=40; i++)
		{
			System.out.print(i);
			if (i%2 == 0)

			System.out.printf(" es par", i);

			if (i%3 == 0)
			System.out.printf(" es divisible entre 3", i);
			System.out.println();
		}
	}
}