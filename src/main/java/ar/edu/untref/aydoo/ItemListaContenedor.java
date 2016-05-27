package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class ItemListaContenedor extends ItemEntrada {
	private ArrayList<ItemEntrada> listaDeItems;

	public ItemListaContenedor(String texto) {
		super(texto, true, false);
		this.listaDeItems = new ArrayList<>();
	}

	@Override
	public String getTextoFormateado(Formateador formateador) {
		return formateador.getInicioItemListaContenedorFormateado() + getFormatoListoEnHTML()
				+ formateador.getFinItemListaContenedorFormateado();
	}

	private String getFormatoListoEnHTML() {
		String html = "";

		Formateador formateadorHTML = new FormateadorHTML();

		for (ItemEntrada item : this.listaDeItems) {
			html += item.getTextoFormateado(formateadorHTML);			
		}

		return html;
	}

	public String getInicioFormateado(Formateador formateador) {
		return formateador.getInicioItemListaContenedorFormateado();
	}

	public String getFinFormateado(Formateador formateador) {
		return formateador.getFinItemListaContenedorFormateado();
	}

	@Override
	public void agregarElementoEnContenedor(ItemEntrada item) {
		// TODO Auto-generated method stub
		this.listaDeItems.add(item);
	}

	public ArrayList<ItemEntrada> getElementosEnColeccion() {
		return this.listaDeItems;
	}

}