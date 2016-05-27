package ar.edu.untref.aydoo;

public class TextoPlano extends ItemEntrada {


	public TextoPlano(String contenido) {
		super(contenido, false, false);
	}

	public String getTextoFormateado(Formateador formateador) {
		return formateador.getTextoPlanoFormateado(this.getTexto());
	}

	@Override
	public void agregarElementoEnContenedor(ItemEntrada item) {
	}

}
