package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TextoPlanoTest {

	@Test
	public void seObtieneContenidoEnFormatoHTMLParaUnTextoPlano() {

		String textoPlanoEntrada = "Texto plano de prueba";
		ItemEntrada textoPlano = new TextoPlano(textoPlanoEntrada);
		String textoPlanoEsperado = textoPlanoEntrada;

		Formateador formateadorHTML = new FormateadorHTML();
		String textoPlanoObtenidoFormatoHTML = textoPlano.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(textoPlanoEsperado, textoPlanoObtenidoFormatoHTML);
	}
	
	@Test
	public void seObtieneContenidoEnFormatoHTMLPara2TextosPlanos() {

		String textoPlanoEntrada = "Texto plano de prueba1";
		String textoPlanoEntrada2 = "Texto plano de prueba2";
		ItemEntrada textoPlano = new TextoPlano(textoPlanoEntrada);
		ItemEntrada textoPlano2 = new TextoPlano(textoPlanoEntrada2);
		String textoPlanoEsperado = textoPlanoEntrada + textoPlanoEntrada2;

		Formateador formateadorHTML = new FormateadorHTML();
		String textoPlanoObtenidoFormatoHTML = textoPlano.getTextoFormateado(formateadorHTML) + textoPlano2.getTextoFormateado(formateadorHTML);

		Assert.assertEquals(textoPlanoEsperado, textoPlanoObtenidoFormatoHTML);
	}
	
}
