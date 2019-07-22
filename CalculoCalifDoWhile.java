import	java.util.Scanner;
public	class	CalculoCalifDoWhile
{
		public	static	void	main(String[]	args)
		{
				int	a=0,n=1;
				double	c=0,t=0,	p=0;
				Scanner	std=new	Scanner(System.in);
				System.out.println("Cuantas	calificaciones	quieres	calcular?");
				a=std.nextInt();
				do
				{
						System.out.println("Dame	una	calificacion");
						c=std.nextDouble();
						t=t+c;
						n++;
				}		while(n<=a);
				p=t/a;
				System.out.println("El	promedio	es	de:	"+p);
		}
}