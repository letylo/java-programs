
public class Empleado {

	//Propiedades
	private String nombre;
	protected int salario;
	private String fechaAlta;
	private String fechaBaja;
	
	//Constructor
	public Empleado(String nombre, int salario, String fecha)
	{
		this.nombre = nombre;
		this.salario = salario;
		this.fechaAlta = fecha;
		this.fechaBaja = null;
	}
	
	//Métodos
	public void darDeBaja(String fecha)
	{
		fechaBaja = fecha;
		salario = 0;
	}
	
	public int calcularSalario()
	{
		return salario;
	}
	
	
	//Creamos una subclase
	public class Vendedor extends Empleado{
		private int ventas;
		private int comision;
		
		//Creamos un metodo solo para la subclase
		public void vender(int cantidad)
		{
			ventas += cantidad;
		}
		
		//Creamos el constructor de la clase Vendedor
		public Vendedor(String nombre, int salario,
				        String fecha, int comision){
			//La palabra clave super sirve para acceder a las
			//propiedades y metodos de la superclase
			super(nombre, salario, fecha);
			this.ventas = 0;
			this.comision = comision;
		}
		
		//Sobreescribimos el metodo calcularSalario de la superclase
		public int calcularSalario()
		{
			return (salario + (ventas * comision / 100));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
