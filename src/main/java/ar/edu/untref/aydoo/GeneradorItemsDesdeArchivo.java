package ar.edu.untref.aydoo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GeneradorItemsDesdeArchivo {

	private FileReader archivoEntrada;
	private Scanner scanner;
	boolean crearListaContenedor = true;

	public GeneradorItemsDesdeArchivo(String archivoEntrada) throws FileNotFoundException {
		this.archivoEntrada = new FileReader(archivoEntrada);
	}

	public List<ItemEntrada> getItemsEntrada(Formateador formateador) throws IOException {

		List<ItemEntrada> itemsEntrada = new LinkedList<ItemEntrada>();
		scanner = new Scanner(archivoEntrada);
		ItemEntrada itemConContenedor = null;
		ItemEntrada itemListaContenedor = null; 
		ItemEntrada itemEntrada;
		boolean pasarASiguienteContenedor = false;
		boolean creoElContenedorDeLista = false;
		boolean agregarListaContenedoraEnContenedor = false;
		
		itemEntrada = getTipoDeItem(scanner.nextLine());
		while (scanner.hasNextLine()) {
			pasarASiguienteContenedor = false;
			if (!itemEntrada.isContieneItems()) {
				itemsEntrada.add(itemEntrada);
			}else {
				itemConContenedor = itemEntrada;
				while (scanner.hasNextLine() && !pasarASiguienteContenedor ) {
					itemEntrada = getTipoDeItem(scanner.nextLine()); 
					if (!itemEntrada.isContieneItems()) {
						if (itemEntrada.isEsContenidoPorUnItemLista()) {
							if (!creoElContenedorDeLista) {
								itemListaContenedor = new ItemListaContenedor("");
								creoElContenedorDeLista = true;
							}
							itemListaContenedor.agregarElementoEnContenedor(itemEntrada);
							agregarListaContenedoraEnContenedor = true;
						}else {						
							itemConContenedor.agregarElementoEnContenedor(itemEntrada);
						}
					}else {
						itemsEntrada.add(itemConContenedor);
						pasarASiguienteContenedor = true;
					}
				}
			}
		}
		if (agregarListaContenedoraEnContenedor) {
			itemConContenedor.agregarElementoEnContenedor(itemListaContenedor);
		}
		itemsEntrada.add(itemConContenedor);		
		return itemsEntrada;
	}

	private ItemEntrada getTipoDeItem(String linea) {

		ItemEntrada itemEntrada = null;
		String caracterizadorLinea = linea.substring(0, 2);
		String textoDesdePosicion2 = linea.substring(2);
		String textoDesdePosicion3 = linea.substring(3);
		
		
		switch (caracterizadorLinea) {
		case "# ":
			itemEntrada = new Titulo(textoDesdePosicion2);
			break;
		case "##":
			itemEntrada = new SubTitulo(textoDesdePosicion3);
			break;
		case "i:":
			itemEntrada = new Imagen(textoDesdePosicion3);
			break;
		case "* ":
			itemEntrada = new ItemLista(textoDesdePosicion2);
			break;
		case "--":
			itemEntrada = new Section("");
			break;
		default:
			itemEntrada = new TextoPlano(linea);
			break;
		}

		return itemEntrada;
	}

}
