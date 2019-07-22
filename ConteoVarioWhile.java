import java.util.Scanner;
public class ConteoVarioWhile
{
	public static void main(String[] args)

	{
		int numo;
		int cont=1;
		int conta=1;
		Scanner lector = new Scanner(System.in);
		System.out.print("Escribe un numero");
		numo = lector.nextInt();

		while (cont<=numo)
		{

			System.out.println();

			while (conta<=cont)
			{
			System.out.printf("%d",conta);
			conta++;
			}
			cont++;
			conta=1;
	    }
				cont=numo;

				while (cont>=1)
				{
					conta=1;
					System.out.println();

					while (conta<cont)
					{
					System.out.printf("%d",conta);
					conta++;
					}
					cont--;

	    }

	}
}