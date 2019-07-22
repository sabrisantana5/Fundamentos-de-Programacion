import	java.util.Scanner;
public	class	PiFor
{
		public	static	void	main(String[]args)
		{
				int	a;
				double	p=0,r=0,	valor;
				Scanner	stdIn=new	Scanner(System.in);
				System.out.println("Con	cuantos	terminos	deseas	calcular	pi?");
				a=stdIn.nextInt();
				for	(double	i=0;i<a;i++)
				{
						valor=1/((2*i)+1);
						if	(i%2!=0)
						{
								valor=-1*valor;
						}
						r+=valor;
				}
				p=4*r;
				System.out.printf("El	resultado	es:	%f%n",p);
		}
}
/* Con cuantos terminos deseas calcular pi?
8
El resultado es: 3.017072 */