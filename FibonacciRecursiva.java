import java.util.Scanner;
public class FibonacciRecursiva
{
    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);
        int n;
        String opcion;
        int cuad=0;
        int suma=0;

        System.out.print("Deseas sacar la serie fibonacci original, al cuadrado o la sumatoria de los primeros elementos ya sea los pares o impares?");
        	opcion=lector.nextLine();
        System.out.print("Hasta que numero deseas crear la serie?");
            n = lector.nextInt();

        if(opcion.equalsIgnoreCase("original"))
        {
          for(int i = 0;i<=n-1;i++)
	  System.out.print("Fibonacci "+ (i+1)+" es: "+ fibonacci(i)+"\n");
  		}
		else if(opcion.equalsIgnoreCase("pares"))
		{
	  	  for(int i=1;i<=n;i++)
	  System.out.print("La sumatoria de los primeros "+ (i)+" elementos pares es: "+ ((fibonacci(2*i))-1)+"\n");
  		}
  		else if (opcion.equalsIgnoreCase("impares"))
  		{
		  for(int i=1;i<=n;i++)
	  System.out.print("La sumatoria de los primeros "+ (i)+" elementos impares es "+ fibonacci(2*i-1)+"\n");
		}
  		else if (opcion.equalsIgnoreCase("cuadrado"))
  		{
			for(int i = 0;i<=n-1;i++)
			{
			cuad = fibonacci(i)*fibonacci(i) ;
			suma+=cuad;
	        System.out.print("Fibonacci cuadrado"+ (i+1)+" es: "+suma +"\n");
  			}

		}
  		else
  		System.out.print("Esa opcion no esta disponible");
}
 static int fibonacci (int n)
 {
  if ((n == 0) || (n == 1))
  		return 1;
  else
 		 return fibonacci(n-1) + fibonacci(n-2);
 }
}