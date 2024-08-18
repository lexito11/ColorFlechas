import javax.swing.JOptionPane;

public class Flecha {
	//se tiene la lase  flecha donde van todos los metodos para la flecha 
	int laLongitud;
	String elColor;
	//el siguiente es el metodo flecha agregando una longtud y un color
	//Para los colores se creo un areglo que los guarde
	// se hizo investigaciones de como imprimir las flechas con colores 
	// y se optó por por desplegar un menú donde el usuario puede escoger los colores de las flechas
	public Flecha(int numeroFlecha) {
		laLongitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha numero " + numeroFlecha + ":"));
		String colores[] = {"Amarillo", "Azul", "Rojo", "Verde", "Negro"};
		elColor = (String)JOptionPane.showInputDialog(null, "Seleccione el color de la flecha numero " + numeroFlecha +":",
				"Seleccione de los colores",
				JOptionPane.QUESTION_MESSAGE, null, 
				colores,
				colores[0]);
	}
	
	// en el siguiente tenemos el metodo flecha con parametros
	public Flecha(int longitud, String color) {
		this.laLongitud = longitud;
		this.elColor = color;
	}
	//el siguiente es un metodo para dejar un espacio
	public void imprimirEspacio() {
		System.out.println();
	}
	//el siguiente metodo es donde se crea la flecha, utilizando dentro de el
	//el iterador for para imprimir la longiitud  ingresada por el usuario
	public void construirFlecha() {
		for (int i = 0; i < laLongitud; i ++) {
			imprime("-");
		}
		imprime(">");
	}

	
	private void imprime(String simbolo) {
		//mostrar el color el consora a escoger
		switch(elColor.toLowerCase()) {
		case "amarillo":
			System.out.print("\033[0;33m" + simbolo);
			break;
		case "azul":
			System.out.print("\033[0;34m" + simbolo);
			break;
		case "rojo":
			System.out.print("\033[0;31m" + simbolo);
			break;
		case "verde":
			System.out.print("\033[0;32m" + simbolo);
			break;
		case "negro":
			System.out.print("\033[0;0m" + simbolo);
			break;
		default:
			System.out.print(simbolo);
			break;
		}
	}
	
	
}
