package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ManejadorDeOpcionesTest {

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModoDefault() throws Exception {

		String modeParametro = "--MODE=DEFAULT";
		String modeEsperado = "DEFAULT";
		String archivoEsperado = "MIPRESENTACION.MD";
		String[] args = { modeParametro, archivoEsperado };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String modeObtenido = manejadorDeOpciones.getMode();
		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();

		Assert.assertEquals(modeEsperado, modeObtenido);
		Assert.assertEquals(archivoEsperado, archivoObtenido);

	}

//	@Test(expected = CombinacionParametrosEx.class)
//	public void modeNoOutputYOutputNoVacioArrojaException() throws Exception {
//
//		String mode = "--MODE=NO-OUTPUT";
//		String archivo = "MIPRESENTACION.MD";
//		String output = "--OUTPUT=carpeta";
//		String[] args = {mode, archivo, output};
//		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
//
//	}
	
		@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModoDefaultArchivoEnPrimerParametro() throws ModeEx, CaracteresInvalidosEx, CombinacionParametrosEx {

		String modeParametro = "--MODE=DEFAULT";
		String archivoEsperado = "MIPRESENTACION.MD";
		String modeEsperado = "DEFAULT";
		String[] args = { archivoEsperado, modeParametro };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
		String modeObtenido = manejadorDeOpciones.getMode();

		Assert.assertEquals(archivoEsperado, archivoObtenido);
		Assert.assertEquals(modeEsperado, modeObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModoNoOutput() throws ModeEx, CaracteresInvalidosEx, CombinacionParametrosEx {
		
		String modeParametro = "--MODE=NO-OUTPUT";
		String modeEsperado = "NO-OUTPUT";
		String archivoEsperado = "MIPRESENTACION.MD";

		String[] args = { modeParametro, archivoEsperado };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
		String modeObtenido = manejadorDeOpciones.getMode();
		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();

		Assert.assertEquals(modeEsperado, modeObtenido);
		Assert.assertEquals(archivoEsperado, archivoObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModoNoOutputArchivoEnPrimerParametro() throws ModeEx, CaracteresInvalidosEx, CombinacionParametrosEx {

		String modeParametro = "--MODE=NO-OUTPUT";
		String archivoEsperado = "MIPRESENTACION.MD";
		String modeEsperado = "NO-OUTPUT";
		String[] args = { archivoEsperado, modeParametro };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
		String modeObtenido = manejadorDeOpciones.getMode();

		Assert.assertEquals(archivoEsperado, archivoObtenido);
		Assert.assertEquals(modeEsperado, modeObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosConOutput() throws ModeEx, CaracteresInvalidosEx, CombinacionParametrosEx {

		String archivoEsperado = "MIPRESENTACION.MD";
		String outputEsperado = "--OUTPUT=PRESENTACION1";

		String[] args = { archivoEsperado, outputEsperado };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
		String outputObtenido = manejadorDeOpciones.getOutput();

		Assert.assertEquals(outputEsperado, outputObtenido);
		Assert.assertEquals(archivoEsperado, archivoObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModeDefaultConOutput() throws ModeEx, CaracteresInvalidosEx, CombinacionParametrosEx {

		String modeParametro = "--MODE=DEFAULT";
		String modeEsperado = "DEFAULT";
		String archivoEsperado = "MIPRESENTACION.MD";
		String outputEsperado = "--OUTPUT=PRESENTACION1";

		String[] args = { modeParametro, archivoEsperado, outputEsperado };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String modeObtenido = manejadorDeOpciones.getMode();
		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
		String outputObtenido = manejadorDeOpciones.getOutput();

		Assert.assertEquals(modeEsperado, modeObtenido);
		Assert.assertEquals(archivoEsperado, archivoObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);

	}

//	@Test(expected = ManejadorDeOpcionesException.class)
//	public void combinacionConOutputYModoNoOutputArrojaExcepcion() throws ManejadorDeOpcionesException {
//
//		String mode = "--MODE=NO-OUTPUT";
//		String archivo = "MIPRESENTACION.MD";
//		String output = "--OUTPUT=PRESENTACION1";
//
//		String[] args = { mode, archivo, output };
//		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
//		manejadorDeOpciones.validarCombinacionDeOpciones();
//
//	}
//
//	@Test
//	public void obtenerOpcionesDesdeArrayDeArgumentosModoDefaultConParametrosCaracterInvalidoParaArchivo() throws ModeEx, CaracteresInvalidosEx, CombinacionParametrosEx {
//
//		String mode = "--MODE=default";
//		String archivo = "MIPRESENTACIO�.MD";
//		String[] args = { mode, archivo };
//		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
//
//		String modeEsperado = "--MODE=DEFAULT";
//		String archivoEsperado = "Nombre de archivo con caracter invalido!";
//
//		String modeObtenido = manejadorDeOpciones.getMode();
//		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
//
//		Assert.assertEquals(modeEsperado, modeObtenido);
//		Assert.assertEquals(archivoEsperado, archivoObtenido);
//
//	}

//	@Test
//	public void obtenerOpcionesDesdeArrayDeArgumentosModoDefaultConParametrosCaracterInvalidoParaOutputyParaArchivo() throws ModeEx, CaracteresInvalidosEx, CombinacionParametrosEx {
//
//		String mode = "--MODE=default";
//		String archivo = "MIPRESENTACIOÑ.MD";
//		String output = "--OUTPUT=PRESENTACIÓN";
//
//		String[] args = { mode, archivo, output };
//
//		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
//
//		String modeEsperado = "--MODE=DEFAULT";
//		String archivoEsperado = "Nombre de archivo con caracter invalido!";
//		String outputEsperado = "Nombre de carpeta con caracter invalido!";
//
//		String modeObtenido = manejadorDeOpciones.getMode();
//		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
//		String outputObtenido = manejadorDeOpciones.getOutput();
//
//		Assert.assertEquals(modeEsperado, modeObtenido);
//		Assert.assertEquals(archivoEsperado, archivoObtenido);
//		Assert.assertEquals(outputEsperado, outputObtenido);
//
//	}
	
//	@Test
//	public void obtenerOpcionesDesdeArrayDeArgumentosModoDefaultConParametrosCaracterInvalidoParaOutput() throws ModeEx, CaracteresInvalidosEx, CombinacionParametrosEx {
//
//		String mode = "--MODE=default";
//		String archivo = "MIPRESENTACION.md";
//		String output = "--OUTPUT=PRESENTACION.";
//
//		String[] args = { mode, archivo, output };
//
//		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
//
//		String modeEsperado = "DEFAULT";
//		String archivoEsperado = "MIPRESENTACION.md";
//		String outputEsperado = "Nombre de carpeta con caracter invalido!";
//
//		String modeObtenido = manejadorDeOpciones.getMode();
//		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
//		String outputObtenido = manejadorDeOpciones.getOutput();
//
//		Assert.assertEquals(modeEsperado, modeObtenido);
//		Assert.assertEquals(archivoEsperado, archivoObtenido);
//		Assert.assertEquals(outputEsperado, outputObtenido);
//
//	}

//	// TODO
//	/*
//	 * Test que verique que el archivo de entrada termine con md para verificar
//	 * que sea realmente el archivo de entrada. Crear excepcion para tal caso
//	 * Test que verique los caracteres validos, Crear excepcion para el caso.
//	 * Terminar de verificar los ordenes combinados Testear Si me pasan
//	 * --MODE=algo no valido Pensar y hacer mas test con otras posibilidades a
//	 * cubrir.
//	 */
//
//	@Test
//	public void seValidaTextoValido() {
//
//		String texto = "nandu";
//		ManejadorDeOpciones obj = new ManejadorDeOpciones();
//		boolean valor = obj.validarNombreArchivo(texto);
//
//		Assert.assertEquals(true, valor);
//
//	}
//
//	@Test
//	public void seValidaTextoInValido() {
//
//		String texto = "nand�";
//		ManejadorDeOpciones obj = new ManejadorDeOpciones();
//		boolean valor = obj.validarNombreArchivo(texto);
//
//		Assert.assertEquals(false, valor);
//
//	}
//
//	@Test
//	public void seValidaTextoInValido1caracter() {
//
//		String texto = "�";
//		ManejadorDeOpciones obj = new ManejadorDeOpciones();
//		boolean valor = obj.validarNombreArchivo(texto);
//
//		Assert.assertEquals(false, valor);
//
//	}
//
//	@Test
//	public void seValidaTextoValido1caracter() {
//
//		String texto = "_";
//		ManejadorDeOpciones obj = new ManejadorDeOpciones();
//		boolean valor = obj.validarNombreArchivo(texto);
//
//		Assert.assertEquals(true, valor);
//
//	}

}