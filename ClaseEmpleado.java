public class ClaseEmpleado //la clase es el molde
{
	public String nombre; //puedes no ponerlo y se entiende
	public double salario;
	private String puesto="";

	public void imprimeDatos() //no tiene estatica por lo tanto cada quien tiene su memoria de variables por separado
	{
		System.out.println("Nombre: \t"+this.nombre); //this literal la variable de este objeto
		System.out.println("Salario: \t"+this.salario);
		System.out.println("Puesto: \t"+this.puesto);
	}
	public boolean setPuesto(String puesto)
	{
		if(puesto.equals("Novia")||puesto.equals("Novio"))
		{
			this.puesto = puesto;
			return true;
		}
		else
			return false;
	}
	public String getPuesto()
	{
		return puesto;
	}
}
//si es publico puedes leer y escribir desde afuera