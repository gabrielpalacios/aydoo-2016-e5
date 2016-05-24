package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class VisualizadorPorPantallaTest {

	@Test
	public void seMuestraContenidoEnFormatoHTMLParaUnTituloDePrueba() {

		String tituloEntrada = "Titulo de prueba";
		ItemEntrada titulo = new Titulo(tituloEntrada);
		String tituloEsperado = "<h1>Titulo de prueba</h1>";

		Formateador formateadorHTML = new FormateadorHTML();
		String tituloObtenidoFormatoHTML = titulo.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(tituloEsperado, tituloObtenidoFormatoHTML);
	}

	@Test
	public void seMuestraContenidoEnFormatoHTMLParaUnSubtituloDePrueba() {

		String subtituloEntrada = "Subtitulo de prueba";
		ItemEntrada subtitulo = new SubTitulo(subtituloEntrada);
		String subtituloEsperado = "<h2>Subtitulo de prueba</h2>";

		Formateador formateadorHTML = new FormateadorHTML();
		String subtituloObtenidoFormatoHTML = subtitulo.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(subtituloEsperado, subtituloObtenidoFormatoHTML);
	}

	@Test
	public void seMuestraContenidoEnFormatoHTMLParaUnTituloYUnSubtituloDePrueba() {

		String tituloEntrada = "Titulo de prueba";
		ItemEntrada titulo = new Titulo(tituloEntrada);
		String tituloEsperado = "<h1>Titulo de prueba</h1>" + "\n";
		String subtituloEntrada = "Subtitulo de prueba";
		ItemEntrada subtitulo = new SubTitulo(subtituloEntrada);
		String subtituloEsperado = "<h2>Subtitulo de prueba</h2>" + "\n";

		List<String> itemsEsperados = new LinkedList<String>();
		itemsEsperados.add(tituloEsperado);
		itemsEsperados.add(subtituloEsperado);

		Formateador formateadorHTML = new FormateadorHTML();
		VisualizadorPorPantalla items = new VisualizadorPorPantalla();
		String tituloObtenidoFormatoHTML = titulo.getTextoFormateado(formateadorHTML);
		String subtituloObtenidoFormatoHTML = subtitulo.getTextoFormateado(formateadorHTML);

		items.agregarItem(tituloObtenidoFormatoHTML);
		items.agregarItem(subtituloObtenidoFormatoHTML);

		Assert.assertEquals(itemsEsperados, items.mostrarItems());
	}

	@Test
	public void seMuestraContenidoEnFormatoHTMLParaUnTituloUnSubtituloYUnaImagenDePrueba() {

		String tituloEntrada = "Titulo de prueba";
		ItemEntrada titulo = new Titulo(tituloEntrada);
		String tituloEsperado = "<h1>Titulo de prueba</h1>" + "\n";
		String subtituloEntrada = "Subtitulo de prueba";
		ItemEntrada subtitulo = new SubTitulo(subtituloEntrada);
		String subtituloEsperado = "<h2>Subtitulo de prueba</h2>" + "\n";
		String imagenEntrada = "imagenDePrueba.jpg";
		ItemEntrada imagen = new Imagen(imagenEntrada);
		String imagenEsperada = "<img src=\"imagenDePrueba.jpg\"/>" + "\n";

		List<String> itemsEsperados = new LinkedList<String>();
		itemsEsperados.add(tituloEsperado);
		itemsEsperados.add(subtituloEsperado);
		itemsEsperados.add(imagenEsperada);

		Formateador formateadorHTML = new FormateadorHTML();
		VisualizadorPorPantalla items = new VisualizadorPorPantalla();
		String tituloObtenidoFormatoHTML = titulo.getTextoFormateado(formateadorHTML);
		String subtituloObtenidoFormatoHTML = subtitulo.getTextoFormateado(formateadorHTML);
		String imagenObtenidaFormatoHTML = imagen.getTextoFormateado(formateadorHTML);

		items.agregarItem(tituloObtenidoFormatoHTML);
		items.agregarItem(subtituloObtenidoFormatoHTML);
		items.agregarItem(imagenObtenidaFormatoHTML);

		Assert.assertEquals(itemsEsperados, items.mostrarItems());
	}
}