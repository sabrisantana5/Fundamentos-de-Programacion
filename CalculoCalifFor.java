import	java.util.Scanner;
public	class	CalculoCalifFor
{
		public	static	void	main(String[]	args)
		{
				int	a=0;
				double	c=0,t=0,	p=0;
				Scanner	std=new	Scanner(System.in);
				System.out.println("Cuantas	calificaciones	quieres	calcular?");
				a=std.nextInt();
				for	(int	n=1;n<=a	;n++	)
				{
						System.out.println("Dame	una	calificacion");
						c=std.nextDouble();
						t=t+c;
				}
				p=t/a;
				System.out.println("El	promedio	es	de:	"+p);
		}
}
/*
Cuantas calificaciones quieres calcular?
8
Dame una calificacion
90
Dame una calificacion
80
Dame una calificacion
75
Dame una calificacion
85
Dame una calificacion
98
Dame una calificacion
76
Dame una calificacion
59
Dame una calificacion
60
El promedio es de: 77.875 */