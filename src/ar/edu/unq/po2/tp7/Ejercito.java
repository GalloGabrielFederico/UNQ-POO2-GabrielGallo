package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

public class Ejercito extends Caminante{
	private List<Caminante> personajes = new ArrayList<>();
	
	public void agregarPersonaje(Caminante personaje) {
		personajes.add(personaje);
	}

	@Override
	public void caminar() {
		for(Caminante personaje : this.personajes) {
			personaje.caminar();
		}
	}

	
}
