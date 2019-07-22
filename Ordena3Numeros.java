//Ejercicio 3, programa que regresa el numero mas pequeño de 3
import java.util.Scanner;
public	class	Ordena3Numeros
{
	public	static	void	main(String[]	args)
		{
			int	a,b,c,primer=0,segundo=0,tercer=0;
			Scanner	stdIn	=	new	Scanner(System.in);
			System.out.println	("Dame	el	primer	numero");
			a=stdIn.nextInt();
			System.out.println	("Dame	el	segundo	numero");
			b=stdIn.nextInt();
			System.out.println	("Dame	el	tercer	numero");
			c=stdIn.nextInt();
			   if	((a<=b)&&(a<=c))
			{
				primer=a;
				if	(b<=c)
			 {	segundo=b;	tercer=c; }
			 	else
			 {	segundo=c;	tercer=b; }
						//System.out.printf	("%d	%d	%d	%n",	primer,segundo,tercer);
			}
			   else	if	((b<=a)&&(b<=c))
			 {	primer=b;
				if	(a<=c)
		      {  segundo=a; tercer=c; }
				else
			  {	segundo=c;	tercer=a; }
						//System.out.printf	("%d	%d	%d	%n",primer,segundo,tercer);
		     }
				else	if	((c<=a)&&(c<=b))
			 { primer=c;
				 if	(b<=a)
				{ segundo=b; tercer=a; }
				else
			    { segundo=a; tercer=b;}
			}
				System.out.printf	("El	orden	de	menor	a	mayor	es	%d	%d	%d	%n",primer,segundo,tercer);
		}
}