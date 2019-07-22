import java.util.Scanner;
public class FibonacciCiclo
{
    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);
        int n,f1=0,f2=0,f3;

        System.out.print("Hasta que numero deseas crear la serie de fibonacci?");
            n = lector.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(i==1 || i==2)
		{
		System.out.println("El "+i+" fibonacci es 1 ");
			f1=1;
			f2=1;
		}
		else
		{
			f3=f1+f2;
		System.out.println("El "+i+" fibonacci es"+f3);
			f1=f2;
			f2=f3;
		}

     }
  }
}