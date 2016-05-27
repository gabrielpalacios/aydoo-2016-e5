package ar.edu.untref.aydoo;

public class Imagen extends ItemEntrada {

	public Imagen(String texto) {
		super(texto, false, false);
	}

	@Override
	public String getTextoFormateado(Formateador formateador) {
		return formateador.getImagenFormateado(this.getTexto());
	}

	@Override
	public void agregarElementoEnContenedor(ItemEntrada item) {		
	}

}
