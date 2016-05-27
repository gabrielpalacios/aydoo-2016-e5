package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Section extends ItemEntrada {

	private ArrayList<ItemEntrada> listaDeItems;

	public Section(String texto) {
		super(texto, true, false);
		this.listaDeItems = new ArrayList<>();
	}

	@Override
	public String getTextoFormateado(Formateador formateador) {
		return formateador.getInicioSectionFormateado() + getElementosContenidosEnFormato()
														+ formateador.getFinSectionFormateado();

	}
	
	public void agregarElementoEnContenedor(ItemEntrada item) {
		this.listaDeItems.add(item);
	}

	private String getElementosContenidosEnFormato() {
		
		String elementosFormateados = "";

		Formateador formateadorHTML = new FormateadorHTML();

		for (ItemEntrada itemEntrada : this.listaDeItems) {
			elementosFormateados += itemEntrada.getTextoFormateado(formateadorHTML);

		}

		return elementosFormateados;
	}

	public ArrayList<ItemEntrada> getElementosEnContenedor() {
		return this.listaDeItems;
	}


}
