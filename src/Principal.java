
public class Principal {
	// se podria decir que estas son las variables que guardan la instancia de cada clase
	Flecha flecha1, flecha2, flecha3;

	public static void main(String[] args) {
		// dentro del metodo main se crean el objeto miPrincipal para que el constructor principal se pueda ejecutar
		Principal miPrincipal = new Principal();
	}
	//metodo principal publico, para creal las instancias de la clase Flecha, o las flechas se quieran en otras palabras
	public Principal() {
		flecha1 = new Flecha(1);
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2 = new Flecha(2);
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3 = new Flecha(3);
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
	}

}
