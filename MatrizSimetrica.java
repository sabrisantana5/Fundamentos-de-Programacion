import	java.util.Random;
import	java.util.Scanner;
public	class	MatrizSimetrica
{
		public	static	void	main(String[]	args)
		{
				int	n;
				Scanner	stdIn	=	new	Scanner(System.in);
				Random	rnd	=	new	Random();
				System.out.println("Dame	el	tamanio	de	la	matriz");
				n=stdIn.nextInt();
				int	[][]matriz=	new	int[n][n];
				for	(int	i=0;i<matriz.length;i++)
				{
						for	(int	j=0;j<matriz[0].length;j++)
						{
								matriz[i][j]	=	rnd.nextInt(7);
								System.out.printf("%d\t",matriz[i][j]);
						}
									System.out.println();
				}
				System.out.println();
				simetria(matriz);
		}
		public	static	void	simetria(int[][]array)
		{
				int	essimetrica=0;
				for	(int	i=0;i<array.length;i++)
				{
						for	(int	j=0;j<array[0].length;j++)
						{
								if	(array[i][j]!=array[j][i])
								{
								essimetrica	=	1;
								}
								System.out.printf("%d\t",array[j][i]);
						}
						System.out.println();
				}
				if	(essimetrica	!=	1)
				{
						System.out.println("Es	una	matriz	simetrica");
				}
				else	if	(essimetrica==1)
				{
						System.out.println("No	es	simetrica");
				}
		}
}