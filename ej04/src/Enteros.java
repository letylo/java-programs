
public class Enteros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short operando1 = 327;
		short operando2 = 100;
		short resultado; //Los operadores binarios solo producen resultados de tipo int o long
		//nunca de tipo short o byte.
		
		//por eso en la operacion tenemos que hacer downcasting 
		//para que resultado sea de tipo short
		resultado = (short) (operando1 + operando2); 
		
		System.out.println("El resultado es: " + resultado);
		
	}

}
