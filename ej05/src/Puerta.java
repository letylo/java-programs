
public class Puerta {

	/**
	 * @param args
	 */
	
	private String color;
	private String modelo;
	private double precio;
	
	public Puerta() {
		this.color = "Blanco";
		this.modelo = "Interna";
		this.precio = 30.50;
	}
	
	public Puerta(String color, String modelo, double precio)
	{
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String toString() {
		return ("Color: " + color + ", " + "Modelo: " + modelo + ", " + "Precio: " + precio);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puerta p1 = new Puerta();
		Puerta p2 = new Puerta("Gris", "P025", 100.5);
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
