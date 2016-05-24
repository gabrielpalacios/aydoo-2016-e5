package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ManejadorDeOpcionesTest {

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModoDefault() {

		String modeEsperado = "--MODE=DEFAULT";
		String archivoEsperado = "MIPRESENTACION.MD";
<<<<<<< HEAD
		String[] args = {modeEsperado, archivoEsperado};
=======

		String[] args = { modeEsperado, archivoEsperado };
>>>>>>> branch 'master' of https://github.com/lucasdcampaner/aydoo-2016-e5
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String modeObtenido = manejadorDeOpciones.getMode();
		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();

		Assert.assertEquals(modeEsperado, modeObtenido);
		Assert.assertEquals(archivoEsperado, archivoObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModoDefaultArchivoEnPrimerParametro() {

		String archivoEsperado = "MIPRESENTACION.MD";
		String modeEsperado = "--MODE=DEFAULT";
<<<<<<< HEAD
		String[] args = {archivoEsperado, modeEsperado};
=======

		String[] args = { archivoEsperado, modeEsperado };
>>>>>>> branch 'master' of https://github.com/lucasdcampaner/aydoo-2016-e5
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
		String modeObtenido = manejadorDeOpciones.getMode();

		Assert.assertEquals(archivoEsperado, archivoObtenido);
		Assert.assertEquals(modeEsperado, modeObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModoNoOutput() {

		String modeEsperado = "--MODE=NO-OUTPUT";
		String archivoEsperado = "MIPRESENTACION.MD";

		String[] args = { modeEsperado, archivoEsperado };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
		String modeObtenido = manejadorDeOpciones.getMode();
		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();

		Assert.assertEquals(modeEsperado, modeObtenido);
		Assert.assertEquals(archivoEsperado, archivoObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModoNoOutputArchivoEnPrimerParametro() {

		String archivoEsperado = "MIPRESENTACION.MD";
		String modeEsperado = "--MODE=NO-OUTPUT";
<<<<<<< HEAD
		String[] args = {archivoEsperado, modeEsperado};
=======

		String[] args = { archivoEsperado, modeEsperado };
>>>>>>> branch 'master' of https://github.com/lucasdcampaner/aydoo-2016-e5
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
		
		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
		String modeObtenido = manejadorDeOpciones.getMode();

		Assert.assertEquals(archivoEsperado, archivoObtenido);
		Assert.assertEquals(modeEsperado, modeObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosConOutput() {

		String archivoEsperado = "MIPRESENTACION.MD";
		String outputEsperado = "--OUTPUT=PRESENTACION1";

<<<<<<< HEAD
		String[] args = {archivoEsperado, outputEsperado};
=======
		String[] args = { outputEsperado, archivoEsperado };
>>>>>>> branch 'master' of https://github.com/lucasdcampaner/aydoo-2016-e5
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
		String outputObtenido = manejadorDeOpciones.getOutput();

		Assert.assertEquals(outputEsperado, outputObtenido);
		Assert.assertEquals(archivoEsperado, archivoObtenido);

	}

	@Test
	public void obtenerOpcionesDesdeArrayDeArgumentosModeDefaultConOutput() {

		String modeEsperado = "--MODE=DEFAULT";
		String archivoEsperado = "MIPRESENTACION.MD";
		String outputEsperado = "--OUTPUT=PRESENTACION1";

		String[] args = { modeEsperado, archivoEsperado, outputEsperado };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);

		String modeObtenido = manejadorDeOpciones.getMode();
		String archivoObtenido = manejadorDeOpciones.getArchivoEntrada();
		String outputObtenido = manejadorDeOpciones.getOutput();

		Assert.assertEquals(modeEsperado, modeObtenido);
		Assert.assertEquals(archivoEsperado, archivoObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);

	}

	@Test(expected = ManejadorDeOpcionesException.class)
	public void combinacionConOutputYModoNoOutputArrojaExcepcion() throws ManejadorDeOpcionesException {

		String mode = "--MODE=NO-OUTPUT";
		String archivo = "MIPRESENTACION.MD";
		String output = "--OUTPUT=PRESENTACION1";

		String[] args = { mode, archivo, output };
		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
		manejadorDeOpciones.validarCombinacionDeOpciones();

	}

}
