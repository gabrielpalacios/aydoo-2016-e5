package ar.edu.untref.aydoo;

public class ModeEx extends Exception{
	
	private static final long serialVersionUID = 1L;

	private final static String mensaje = "No existe el mode ingresado.";

	public ModeEx() {
		super(mensaje);
	}

}
