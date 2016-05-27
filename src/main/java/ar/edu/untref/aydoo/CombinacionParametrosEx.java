package ar.edu.untref.aydoo;

public class CombinacionParametrosEx extends Exception {

	private static final long serialVersionUID = 1L;

	private final static String mensaje = "La combinacion de parametros es invalida.";

	public CombinacionParametrosEx() {
		super(mensaje);
	}

}
