// Ejercicio, determina el tipo de vehiculo y si el grosor es adecuado
import	java.util.Scanner;
public	class	RuedaCuestionario
{
	public	static	void	main	(String	[]	args)
	{
			double	d,g;
			Scanner	stdIn	=	new	Scanner(System.in);
			System.out.println	("Cual	es	el	diametro	de	la	llanta");
			d=stdIn.nextDouble();
			   if	(d>1.4)
		{
			System.out.println("La	llanta	es	para	un	vehiculo	grande");
			System.out.println("Cual	es	el	grosor	de	la	llanta");
			g=stdIn.nextDouble();
		    	if	(g<.4)
			{ System.out.println("El	grosor	no	es	adecuado"); }
					 else
			{ System.out.println("El	grosor	es	adecuado");	}
		}
			  else	if	((d>=.8)&&(d<=1.4))
		{
			  System.out.println("La	llanta	es	para	un	vehiculo	mediano");
			  System.out.println("Cual	es	el	grosor	de	la	llanta");
				g=stdIn.nextDouble();
					if	(g<.25)
			{ System.out.println("El	grosor	no	es	adecuado");	}
					else
			{ System.out.println("El	grosor	es	adecuado"); }
	    }
			  else
			{ System.out.println("La	llanta	es para	un	vehiculo	chico"); }
	}
}