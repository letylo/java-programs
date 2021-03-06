/**
 * 
 */

/**
 * @author Atenea
 *
 */
public class Coche {

	private static int numRuedas = 4;
	private String color;
	private int posX;
	private int posY;
	private int velocidad;

//Metodos de la clase Coche	(mover, acelerar, frenar)
void mover(int x, int y)
{
	if (x != getPosX())
		setPosX(x);
	if (y != getPosY())
		setPosY(y);
}

int acelerar()
{
	setVelocidad(getVelocidad() + 10);
	return getVelocidad();
}

int frenar()
{
	if(getVelocidad() > 10)
		setVelocidad(getVelocidad() - 10);
	else
		setVelocidad(0);
	
	return getVelocidad();
}

//Este es el constructor de la clase Coche
public Coche(String color, int posx, int posy) 
{
	this.setColor(color);
	this.setPosX(posx);
	this.setPosY(posy);
	this.setVelocidad(0);	
}


public static void main(String[] args)
{
	//As� creamos un objeto de la clase Coche
	Coche a = new Coche("rojo", 0, 0);
	
	//Escribimos por pantalla
	System.out.println("La velocidad del coche " + a.getColor() + " es de " + a.getVelocidad());
	
	//Llamamos al metodo acelerar
	a.acelerar();
	System.out.println("Tras acelerar la velocidad del coche es " + a.getVelocidad());
	
	//Llamamos al metodo frenar
	a.frenar();
	System.out.println("Tras frenar la velocidad del coche es " + a.getVelocidad());
	
	//Accedemos a la propiedad de la clase Coche numRuedas
	System.out.println("El n�mero de ruedas del coche es " + a.getNumRuedas());
}

private static int getNumRuedas() {
	return numRuedas;
}

private static void setNumRuedas(int numRuedas) {
	Coche.numRuedas = numRuedas;
}

private int getPosX() {
	return posX;
}

private void setPosX(int posX) {
	this.posX = posX;
}

private int getPosY() {
	return posY;
}

private void setPosY(int posY) {
	this.posY = posY;
}

private int getVelocidad() {
	return velocidad;
}

private void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}

private String getColor() {
	return color;
}

private void setColor(String color) {
	this.color = color;
}

}


	


	

