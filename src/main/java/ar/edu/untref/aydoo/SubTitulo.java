package ar.edu.untref.aydoo;

public class SubTitulo extends ItemEntrada {

	public SubTitulo(String texto) {
		super(texto, false, false);
	}

	@Override
	public String getTextoFormateado(Formateador formateador) {
		return formateador.getSubTituloFormateado(this.getTexto());
	}

	@Override
	public void agregarElementoEnContenedor(ItemEntrada item) {
	}

}
