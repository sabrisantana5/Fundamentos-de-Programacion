/*
4.  Un número entero es primo si ningún otro número primo más pequeño que él es divisor suyo.
A continuación escribir un programa que rellene un arreglo con los 80 primeros número primos y los visualice. */

public class PrimosArreglos
{
	public static void main(String[] args)
	{
			int count=0;
			int[] array=new int[80];
				for(int i=0;i<81;i++)
			{
				for (int j=i-1;j>1;j--)
					{
						if (i%j!=0)
						{
						count++;
						}
					}

				if(count==i-2)
				{
					array[i]=i;
				System.out.println(array[i]);
				}
			count=0;
			}
	}
}

