import	java.util.Scanner;
public	class	PiDoWhile
{
		public	static	void	main(String[]args)
		{
				int	a;
				double	p=0,r=0,	i=0,	valor;
				Scanner	stdIn=new	Scanner(System.in);
				System.out.println("Con	cuantos	terminos	deseas	calcular	pi?");
				a=stdIn.nextInt();
				do
				{
						valor=1/((2*i)+1);
						if	(i%2!=0)
						{
								valor=-1*valor;
						}
						r+=valor;
						i++;
				}					while	(i<a);
				p=4*r;
				System.out.printf("El	resultado	es:	%f%n",p);
		}
}