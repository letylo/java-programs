//import JOPtionPane;
public class Persona {
	private String Paco;
	/**
	 * @param args
	 */
	//Constantes
	private final static char SEXO = 'H';
	
	//Atributos
	private String nombre = "";
	private String DNI;
	private int edad = 0;
	private int peso = 0;
	private int altura = 0;
	
    //Constructor por defecto
	public Persona(){
		 this("", 0, SEXO, 0, 0);
	}
	//Constructor con 3 parametros
	public Persona(String nombre, int edad, char sexo){
		 this(nombre, edad, sexo, 0, 0);
	}
	
	//Constructor con 5 parametros
	public Persona(String nombre, String DNI, int edad, int peso, int altura){
		 this.nombre=nombre;
	     this.edad=edad;
	     this.peso=peso;
	     this.altura=altura;
	}
  
	//Métodos privados
	private String comprobarSexo(char sexo)
	{
		if(sexo != 'H' && sexo != 'M')
			this.sexo = 'H';
		else
			this.sexo = sexo;
	}
		
	public void generaDNI()
	{
			
	}
		
		
	//Metodos públicos
	public int calcularIMC()
	{
		//Calcula si la persona esta en su peso idea kg/altura^2 en m
	}
	
	public boolean esMayorDeEdad()
	{
		boolean mayor = false;
		if(edad >= 18)
			mayor = true;
		return mayor;
	}
			
	public String toString()
	{
		
	}
		
	private static void main(String[] args) {
		
	}
}
