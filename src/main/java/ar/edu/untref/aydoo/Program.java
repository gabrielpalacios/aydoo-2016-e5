package ar.edu.untref.aydoo;

import java.util.List;

public class Program {

	private final static String modeDefault = "DEFAULT";
	private final static String noOutput = "NO-OUTPUT";
	
	private static String mode;
	private static String archivoEntrada;
	private static String output;
	private static String carpetaSalida;

	public static final void main(String args[]) throws Exception {
		
		getParametrosAplicacion(args);
		Formateador formateadorHTML = new FormateadorHTML();
		GeneradorItemsDesdeArchivo generadorItemsDesdeArchivo = new GeneradorItemsDesdeArchivo(archivoEntrada);
		List<ItemEntrada> itemsEntrada = generadorItemsDesdeArchivo.getItemsEntrada(formateadorHTML);
		GeneradorSalida generadorSalida = new GeneradorSalida(archivoEntrada);
				
		switch (mode) {
		case modeDefault:
			generadorSalida.setCarpetaSalida(carpetaSalida);	
			generadorSalida.copiarArchivosDesdePlantilla();
			generadorSalida.sobreEscribirLineaEnIndex(itemsEntrada, formateadorHTML);			
			break;
		case noOutput:
			String salidaPorPantallaAImprimir;
			salidaPorPantallaAImprimir = generadorSalida.generarStringSalida(itemsEntrada, formateadorHTML);
			System.out.println(salidaPorPantallaAImprimir);
			break;
		default:
			generadorSalida.setCarpetaSalida(carpetaSalida);	
			generadorSalida.copiarArchivosDesdePlantilla();
			generadorSalida.sobreEscribirLineaEnIndex(itemsEntrada, formateadorHTML);
			break;
		}	
	}
	
	private static void getParametrosAplicacion(String[] args) throws Exception {

		ManejadorDeOpciones manejadorDeOpciones = new ManejadorDeOpciones(args);
		mode = manejadorDeOpciones.getMode();
		archivoEntrada = manejadorDeOpciones.getArchivoEntrada();
		output = manejadorDeOpciones.getOutput();
		if (output.isEmpty()) { 
			carpetaSalida = archivoEntrada.substring(0,archivoEntrada.indexOf("."));
		}else {
			carpetaSalida = output.substring(9, output.length());
		}	
	}
}
