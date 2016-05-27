package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TituloTest {

	@Test
	public void seObtieneContenidoEnFormatoHTMLParaUnTituloDePrueba() {

		String tituloEntrada = "Titulo de prueba";
		ItemEntrada titulo = new Titulo(tituloEntrada);
		String tituloEsperado = "<h1>Titulo de prueba</h1>";

		Formateador formateadorHTML = new FormateadorHTML();
		String tituloObtenidoFormatoHTML = titulo.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(tituloEsperado, tituloObtenidoFormatoHTML);
	}

	@Test
	public void seCreaTituloyRecuperaTexto() {

		String contenido = "el titulo";
		ItemEntrada titulo = new Titulo(contenido);

		String textoDelTitulo = titulo.getTexto();

		Assert.assertEquals(contenido, textoDelTitulo);
	}

	@Test
	public void seObtieneContenidoEnFormatoHTMLParaUnTituloDePruebaVacio() {

		String tituloEntrada = "";
		ItemEntrada titulo = new Titulo(tituloEntrada);
		String tituloEsperado = "<h1></h1>";

		Formateador formateadorHTML = new FormateadorHTML();
		String tituloObtenidoFormatoHTML = titulo.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(tituloEsperado, tituloObtenidoFormatoHTML);
	}
	
	@Test
	public void seObtieneContenidoEnFormatoHTMLParaDosTitulosDePrueba() {

		String contenido = "el titulo1";
		ItemEntrada titulo = new Titulo(contenido);
		String contenido2 = "el titulo2";
		ItemEntrada titulo2 = new Titulo(contenido2);

		Formateador formateadorHTML = new FormateadorHTML();
		String tituloObtenidoFormatoHTML = titulo.getTextoFormateado(formateadorHTML) + titulo2.getTextoFormateado(formateadorHTML);
		String tituloEsperado = "<h1>el titulo1</h1><h1>el titulo2</h1>";
		Assert.assertEquals(tituloEsperado, tituloObtenidoFormatoHTML);
	}

}
