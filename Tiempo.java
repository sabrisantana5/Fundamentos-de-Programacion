// Calculo de diferencia de horas
import	java.util.Scanner;
public	class	Tiempo
{
  public	static	void	main(String[]args)
    {
	int	h=11,m=59,s=60,h1,m1,s1,h2,m2,s2,ht,mt,st;
	Scanner	stdIn	=	new	Scanner(System.in);
	System.out.println("Que	valor	tiene	la	primera	hora");
	h1=stdIn.nextInt();
	System.out.println("Que	valor	tiene	la	segunda	hora");
	h2=stdIn.nextInt();
	System.out.println("Que	valor	tienen	los	primeros	minutos");
	m1=stdIn.nextInt();
	System.out.println("Que	valor	tienen	los	segundos	minutos	");
	m2=stdIn.nextInt();
	System.out.println("Que	valor	tienen	los	primeros	segundos");
	s1=stdIn.nextInt();
	System.out.println("Que	valor	tienen	los	segundos	segundos");
	s2=stdIn.nextInt();

		if	((h1<h)&&(h2<h)&&(m1<m)&&(m2<m)&&(s1<s)&&(s2<s))
	{
		if	(h1<h2)

		{ ht=h2-h1; }
		else
		{ ht=h1-h2; }

		if	(m1<m2)
		{ mt=m2-m1; }
		else
		{ mt=m1-m2; }

		if	(s1<s2)
		{ st=s2-s1; }
		else
		{ st=s1-s2; }
		System.out.println("Han	pasado	"+ht+"horas	"+mt+"minutos	"+st+"segundos");
	}
		else
		{	System.out.println("Se	exceden	de	las	12	horas"); }
    }
}