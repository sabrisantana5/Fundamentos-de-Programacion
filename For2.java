// for dentro de otro for
public class For2
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++) //se hace el 1 con el de adentro y luego el 2 con el de adentro y asi
		{
			System.out.println("Estoy en la i="+i);
			for(int j=1; j<=4; j++)
			{
				System.out.printf("(%d,%d)",i,j);
			}
			System.out.println();

		}
	}
}
/* Estoy en la i=1
(1,1)(1,2)(1,3)(1,4)
Estoy en la i=2
(2,1)(2,2)(2,3)(2,4)
Estoy en la i=3
(3,1)(3,2)(3,3)(3,4)
Estoy en la i=4
(4,1)(4,2)(4,3)(4,4)
Estoy en la i=5
(5,1)(5,2)(5,3)(5,4) */