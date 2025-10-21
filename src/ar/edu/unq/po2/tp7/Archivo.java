package ar.edu.unq.po2.tp7;

import java.time.*;

public class Archivo implements FyleSystem{
	private String nombre;
	
	private int espacio;
	
	private LocalDate fecha;

	public Archivo(String nombre, int espacio, LocalDate fecha) {
		this.nombre = nombre;
		this.espacio = espacio;
		this.fecha = fecha;
	}

	@Override
	public int totalSize() {
		return espacio;
	}

	@Override
	public void printStructure() {
		System.out.println(this.getNombre());
	}

	@Override
	public FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this;
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
