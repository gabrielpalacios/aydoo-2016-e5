package ar.edu.untref.aydoo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

//import org.apache.commons.io.FileUtils;


public class GeneradorSalida {

	private final String lineaASobreEscribir = "[este-es-el-texto-a-reemplazar]";
	
	private String nombreArchivoEntrada;
	private String nombreCarpetaSalida;
	private Scanner scanner;

	public GeneradorSalida(String nombreArchivoEntrada) {
		this.nombreArchivoEntrada = nombreArchivoEntrada;
	}
	
	public void setCarpetaSalida(String nombreCarpetaSalida) {
		this.nombreCarpetaSalida = nombreCarpetaSalida;
	}
	
	private String obtenerPathJar() {
		File jar = new File(System.getProperty("java.class.path")); 
		File direccionJar = jar.getAbsoluteFile().getParentFile();
		String pathJar = direccionJar.toString();
		return pathJar;
		
		//solo test
		//return "C:\\gitfuentes\\tp1gab\\aydoo-2016-e5";
	}

	private File obtenerIndexHTML() {
		File indexHTML = new File(obtenerPathJar() + "/" + this.nombreCarpetaSalida + "/index.html");
		return indexHTML;
	}
	
	public void copiarArchivosDesdePlantilla() throws IOException {
		
		String pathJar = obtenerPathJar();
		//String pathJar = "C:\\gitfuentes\\tp1gab\\aydoo-2016-e5";
		File plantilla = new File(pathJar + "/plantilla");
		File carpetaSalida = new File(pathJar + "/" + this.nombreCarpetaSalida);		
		
		//comentada
		//FileUtils.copyDirectory(plantilla, carpetaSalida);
	
		DirUtils.copy(plantilla.toPath(), carpetaSalida.toPath());
	}

	public void sobreEscribirLineaEnIndex(List<ItemEntrada> itemsEntrada, Formateador formateador) throws IOException {

		String stringSalida = generarStringSalida(itemsEntrada, formateador);
		File indexHTML = obtenerIndexHTML();
		FileWriter indexNuevo = crearArchivoIndexNuevoARenombrar();
		scanner = new Scanner(indexHTML);
		String lineaLeida = "";
		
		while (scanner.hasNextLine()) {
			lineaLeida = scanner.nextLine();
			if (lineaLeida.toUpperCase().trim().equals(lineaASobreEscribir.toUpperCase().trim())) {
				escribirArchivoIndexNuevoARenombrar(indexNuevo, stringSalida);
			} else {
				escribirArchivoIndexNuevoARenombrar(indexNuevo, lineaLeida);
			}			
		}
		scanner.close();
		cerrarArchivoIndexNuevoARenombrar(indexNuevo);
		borrarIndexHTMLActual(indexHTML);
		renombrarArchivoIndexNuevo(indexHTML);
	}

	private FileWriter crearArchivoIndexNuevoARenombrar() throws IOException {
		String pat = obtenerPathJar();
		//String pat = "C:\\gitfuentes\\tp1gab\\aydoo-2016-e5";
		String file = pat + "/" + this.nombreCarpetaSalida + "/indexNuevo.html"; 
		FileWriter indexNuevo = new FileWriter(file);
		return indexNuevo;
	}
	
	private void cerrarArchivoIndexNuevoARenombrar(FileWriter indexNuevo) throws IOException {
		indexNuevo.close();
	}

	private void borrarIndexHTMLActual(File indexHTML) throws IOException {
		//java.nio.file.Path#delete()
		//		boolean pudo = indexHTML.delete();
		//boolean pudo = 
		java.nio.file.Files.delete(indexHTML.toPath());
				
		//pudo = pudo;
	}

	private void escribirArchivoIndexNuevoARenombrar(FileWriter indexNuevo, String lineaAEscribir) throws IOException {
		indexNuevo.write(lineaAEscribir + "\n");
	}

	private void renombrarArchivoIndexNuevo(File indexHTML){
		File archivoARenombrar = new File(obtenerPathJar() + "/" + this.nombreCarpetaSalida + "/indexNuevo.html");
		boolean pudo = archivoARenombrar.renameTo(indexHTML);
		pudo = pudo;
	}
	
	public String generarStringSalida(List<ItemEntrada> itemsEntrada, Formateador formateador) {

		String stringSalida = "";

		for (ItemEntrada itemEntrada : itemsEntrada) {
			stringSalida = stringSalida + itemEntrada.getTextoFormateado(formateador);
		}

		return stringSalida;
	}

}