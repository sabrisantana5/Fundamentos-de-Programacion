import java.util.Scanner;
public class ConteoVarioDoWhile
{
	public static void main(String[] args)
	{
		int numo;
		int cont=1;
		int conta=1;
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe un numero");
		numo = lector.nextInt();
		do
		{
			System.out.println();
			do
			{
			System.out.printf("%d",conta);
			conta++;
			} while (conta<=cont);
			cont++;
			conta=1;
	    } while (cont<=numo);

				cont=numo;

				do
				{
					conta=1;
					System.out.println();

					do
					{
					System.out.printf("%d",conta);
					conta++;
					} while (conta<cont);
					cont--;

	  			  } while (cont>1);

	}
}