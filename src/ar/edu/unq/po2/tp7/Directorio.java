package ar.edu.unq.po2.tp7;

import java.time.*;
import java.util.*;


public class Directorio implements FyleSystem{
	private List<FyleSystem> elementos = new ArrayList<>();
	
	private String nombre;
	
	private LocalDate fecha;

	public Directorio(List<FyleSystem> elementos, String nombre, LocalDate fecha) {
		this.elementos = elementos;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public void agregar(FyleSystem elemento) {
		this.elementos.add(elemento);
	}

	@Override
	public int totalSize() {
		int tamañoTotal = 0;
		for(FyleSystem elemento : this.elementos) {
			tamañoTotal += elemento.totalSize();
		}
		return tamañoTotal;
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FyleSystem lastModified() {
		return this.elementos.stream()
				   .max(Comparator.comparing(FyleSystem::getFecha))
				   .orElse(this);
	}

	@Override
	public FyleSystem oldestElement() {
		List<FyleSystem> nuevaLista = new ArrayList<>(this.elementos);
		nuevaLista.add(this);
		
		return nuevaLista.stream()
						 .min(Comparator.comparing(FyleSystem::getFecha))
						 .orElse(this);
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public LocalDate getFecha() {
		return fecha;
	}
	

}
