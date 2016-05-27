package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ItemListaContenedorTest {

	@Test
	public void seCreaItemListaEspecificadaRecuperandoSuNombre() {

		String contenido = "un item de una lista";
		ItemEntrada itemLista = new ItemListaContenedor(contenido);

		String textoLista = itemLista.getTexto();

		Assert.assertEquals(contenido, textoLista);

	}

	@Test
	public void seObtieneVacioEnFormatoHTMLParaUnaLista() {

		ItemEntrada itemListaContenedor = new ItemListaContenedor("");

		String itemListaEsperada = "<ul></ul>";

		Formateador formateadorHTML = new FormateadorHTML();
		String itemListaObtenidaFormatoHTML = itemListaContenedor.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(itemListaEsperada, itemListaObtenidaFormatoHTML);

	}
}
