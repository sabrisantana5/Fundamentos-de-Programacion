// Ejercicio 1, programa que te regrese el numero mas pequeño de 3
import	java.util.Scanner;
public	class	NumeroMenor
{
public	static	void	main(String	[]	args)
{
Float	num1;
Float	num2;
Float	num3;
Scanner	stdIn	=	new	Scanner(System.in);
System.out.println	("Dame	el	primer	numero");
num1	=	stdIn.nextFloat();
System.out.println	("Dame	el	segundo	numero");
num2	=	stdIn.nextFloat();
System.out.println	("Dame	el	tercer	numero");
num3	=	stdIn.nextFloat();
if	(num1<num2)
{
if	(num1<num3)
{
System.out.println	("El	numero	mas	chico	es	"+	num1);
}
}
else	if(num2<num3)
{
if	(num2<num1)
{
System.out.println	("El	numero	mas	chico	es	"+	num2);
}
else
{
System.out.println	("El	numero	mas	chico	es	"+	num3);
}
}
}
}