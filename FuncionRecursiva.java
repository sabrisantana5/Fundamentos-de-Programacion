public class FuncionRecursiva
	{
		public static void main(String[] args)
			{
			//calculo de sumatoria hasta n
			int n = 15;
			System.out.printf("%d%n", sumatoria(n));
			System.out.printf("%d%n", sumatoriaRecursiva(n));
			System.out.printf("%d%n", factorialRecursiva(n));
			System.out.printf("%d%n", BonacciRecursiva(n));
			}

		public static int sumatoriaRecursiva(int n)
		{
			if(n==1)
			   return 1;
			else if(n<0)
			   return 0;
			else
				return n+sumatoriaRecursiva(n-1);
			 /* n = 3 , 3 + (SR(2))
			 			3 + (2 + SR(1))
			 			3 + (2 + 1)      siempre usa un if else */

		}

		public static long factorialRecursiva(int n)
		{
			if(n<=1)
			 return 1;
			else
				return n*factorialRecursiva(n-1);
		}

			public static long BonacciRecursiva(int n)
				{

					if(n<=1)
					 return n;
					else
						return BonacciRecursiva(n-1)+BonacciRecursiva(n-2);
				}

		public static int sumatoria (int n)
			{
				int suma = 0;
			for(int cont=1; cont<=n; cont++)
				{
					suma += cont;
				}
				return suma;
			}
	}