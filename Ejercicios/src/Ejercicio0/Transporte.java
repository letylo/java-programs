
/**
 * 
 */
package Ejercicio0;

/**
 * @author Atenea
 *
 */
public class Transporte {

	/**
	 * @param args
	 */
	
	//Atributos
	private int numPasajeros;
	private float velocidad;
	private int precioPersonaTrayecto;
	
	
	/**Constructor con parametros
	 * @param numPasajeros
	 * @param velocidad
	 * @param precioPersonaTrayecto
	 */
	public Transporte(int numPasajeros, float velocidad, int precioPersonaTrayecto) {
		super();
		this.numPasajeros = numPasajeros;
		this.velocidad = velocidad;
		this.precioPersonaTrayecto = precioPersonaTrayecto;
	}
	
	/**Constructor sin parametros
	 * 
	 */
	public Transporte() {
		super();
		this.numPasajeros = 50;
		this.velocidad = 200;
		this.precioPersonaTrayecto = 40;
	}
	
	//M�todos p�blicos
	public int calcularPrecioTrayecto(){		
		return this.getPrecioPersonaTrayecto()*this.getNumPasajeros();
	}
	
	
	private int getNumPasajeros() {
		return numPasajeros;
	}


	private void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}


	private float getVelocidad() {
		return velocidad;
	}


	private void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}


	private int getPrecioPersonaTrayecto() {
		return precioPersonaTrayecto;
	}


	private void setPrecioPersonaTrayecto(int precioPersonaTrayecto) {
		this.precioPersonaTrayecto = precioPersonaTrayecto;
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un objeto
		Transporte tren = new Transporte(175, 200, 65);	
		
		tren.calcularPrecioTrayecto();
		System.out.println("El precio por persona es " + tren.getPrecioPersonaTrayecto() + 
				" y el numero de personas es " + tren.getNumPasajeros() +
				 " en total ser�a " + tren.calcularPrecioTrayecto() + "�");
	}

}
