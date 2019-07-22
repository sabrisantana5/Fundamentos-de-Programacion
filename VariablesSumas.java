public class VariablesSumas

{
	public static void main(String[] args)
	{	//Declarar variables:
	int numero1;
	double numero2, numero3 = 0;

	double pi= 3.14;
	final double velocidadadDeLaLuz = 299792458.0;
	pi = 3.1416;
	// velocidadDeLaLuz = 3.0; ERROR PORQUE ES FINAL
	numero3++;//operacion unaria
	++numero3; //operacion unaria
	numero1 = (int)pi; //CAST
	numero2 = (numero1+numero3) / 2 ;
	//numero2 = numero2+numero1;
	numero2 += numero1;

	System.out.println(numero1);
	System.out.println(numero2);
	System.out.println(Math.sqrt(numero2++));//primero saca la raiz y despues le suma el uno, si lo pones antes primero le suma y despues saca la raiz
	System.out.println(numero2);
	}
}