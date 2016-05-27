package ar.edu.untref.aydoo;

public class CaracteresInvalidosEx extends Exception{

	private static final long serialVersionUID = 1L;

	private final static String mensaje = "El nombre de archivo contiene caracteres invalidos.";

	public CaracteresInvalidosEx() {
		super(mensaje);
	}
	
}
