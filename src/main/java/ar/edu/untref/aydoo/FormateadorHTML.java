package ar.edu.untref.aydoo;

public class FormateadorHTML extends Formateador {

	@Override
	public String getInicioSectionFormateado() {
		
		String sectionFormateada = "<section>";
		return sectionFormateada;
	}
	
	@Override
	public String getFinSectionFormateado() {
		
		String sectionFormateada = "</section>";
		return sectionFormateada;
	}

	@Override
	public String getTituloFormateado(String texto) {

		String tagInicio = "<h1>";
		String tagFin = "</h1>";

		String tituloFormateado = tagInicio + texto + tagFin;

		return tituloFormateado;
	}

	@Override
	public String getSubTituloFormateado(String texto) {

		String tagInicio = "<h2>";
		String tagFin = "</h2>";

		String subTituloFormateado = tagInicio + texto + tagFin;

		return subTituloFormateado;
	}

	@Override
	public String getImagenFormateado(String texto) {

		String tagInicio = "<img src=\"";
		String tagFin = "\"/>";

		String imagenFormateado = tagInicio + texto + tagFin;

		return imagenFormateado;
	}


	@Override
	public String getItemListaFormateado(String texto) {

		String tagInicio = "<li>";
		String tagFin = "</li>";

		String imagenFormateado = tagInicio + texto + tagFin;

		return imagenFormateado;
	}

	@Override
	public String getInicioItemListaContenedorFormateado() {
		String itemListaFormateada = "<ul>";
		return itemListaFormateada;
	}

	@Override
	public String getFinItemListaContenedorFormateado() {
		String itemListaFormateada = "</ul>";
		return itemListaFormateada;
	}

	@Override
	public String getTextoPlanoFormateado(String texto) {
		return texto;
	}

}
