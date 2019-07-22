//Muestre un conteo de 1 a 100 con una funcion recursiva, del 1 al 10 y del 4 al 8
public class EjemploRecursiva1
	{
		public static void main(String[] args)
			{
				int n=1;
				int num=10;
				int nam=8;
				System.out.printf("%d %n",conteoRecursivo(n));
				conteo(num);
				conteoespecifico(nam);

			}
						public static int conteoRecursivo(int n)
						{
							if(n==5)

							 return 5;

							 else
							 {
							    System.out.print(n+"\n");
							   return conteoRecursivo(n+1);
						   	}

						}

						public static void conteo(int num)
						{
							if(num==0)

								return; //si es void puedes retornar nada

							else
							{
								conteo(num-1); //aqui lo pone del 1 lal 10 ,si lo pones abajo del system se invierte el orden
								//llama de nuevo al metodo pero ahora con num-1, esto hace que los numeros se vayan guardando
								//y al final imprima los que ya llevas por el return.
								System.out.printf("%d %n", num);
								return;
							}

						}

													public static void conteoespecifico(int nam)
													{
														if(nam<4)

															return;

														else
														{
															conteoespecifico(nam-1);
															System.out.printf("%d %n", nam);
															return;
														}
													}

}