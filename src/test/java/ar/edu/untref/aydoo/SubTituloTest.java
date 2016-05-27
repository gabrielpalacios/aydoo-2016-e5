package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class SubTituloTest {

	@Test
	public void seObtieneContenidoEnFormatoHTMLParaUnSubTituloDePrueba() {

		String subTituloEntrada = "SubTitulo de prueba";
		ItemEntrada subTitulo = new SubTitulo(subTituloEntrada);
		String subTituloEsperado = "<h2>SubTitulo de prueba</h2>";

		Formateador formateadorHTML = new FormateadorHTML();
		String subTituloObtenidoFormatoHTML = subTitulo.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(subTituloEsperado, subTituloObtenidoFormatoHTML);
	}

	@Test
	public void seCreaSubTituloyRecuperaTexto() {

		String contenido = "el SubTitulo";
		ItemEntrada subTitulo = new SubTitulo(contenido);

		String textoDelTitulo = subTitulo.getTexto();

		Assert.assertEquals(contenido, textoDelTitulo);
	}

	@Test
	public void seObtieneContenidoEnFormatoHTMLParaUnSubTituloDePruebaVacio() {

		String subTituloEntrada = "";
		ItemEntrada subTitulo = new SubTitulo(subTituloEntrada);
		String subTituloEsperado = "<h2></h2>";

		Formateador formateadorHTML = new FormateadorHTML();
		String subTituloObtenidoFormatoHTML = subTitulo.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(subTituloEsperado, subTituloObtenidoFormatoHTML);
	}

}
