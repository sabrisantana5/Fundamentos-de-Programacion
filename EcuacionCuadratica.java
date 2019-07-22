import java.util.Scanner;
public class EcuacionCuadratica
{
	public static void main(String[] args)
	{
				System.out.println("Solución a ecuación cuadrática tipo AX^2+BX+C ");
						cuadratica();
	}

   public static double cuadratica ()

	{
		Scanner lector = new Scanner (System.in);
							double a, b, c, x1, x2, primero, segundo, raiz, dentro;

				System.out.println("Introduzca la variable a ");
							  a = lector.nextDouble();
			    System.out.println("Introduzca la variable b");
							  b = lector.nextDouble();
			    System.out.println("Introduzca la variable c");
							  c = lector.nextDouble();

								  dentro = (b*b-4*a*c);
		          if (dentro<0)
		          {
			        raiz = Math.sqrt(-1*dentro);
		      	    segundo = (raiz/(2*a));
		      	    primero =  (-b/(2*a));
				    System.out.printf("La primer solucion es %f + %f i\n", primero, segundo);
					System.out.printf("La segunda solucion es %f - %f i\n", primero, segundo);
			  	  }
			  	  else if(dentro == 0)
				  {
					primero = (-b/(2*a));
        			System.out.printf("La solucion es %f",primero);
			      }
			      else
			      {
				      raiz = Math.sqrt(dentro);
		              x1 =  ((-b+raiz)/(2*a));
		              x2 =  ((-b-raiz)/(2*a));
	   				 System.out.printf("La primer solución es %f\n", x1);
					 System.out.printf("La segunda solución es %f\n", x2);
			      }
			      return dentro;
      }
}
