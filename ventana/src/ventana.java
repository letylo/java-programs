import javax.swing.JOptionPane;

public class ventana {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

	JOptionPane.showMessageDialog(null, "Bienvenid@ " + nombre);
	}

}
