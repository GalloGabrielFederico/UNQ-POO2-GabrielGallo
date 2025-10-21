package ar.edu.unq.po2.tp4;

public class Producto {
	private double precio;
	
	private String nombre;
	
	private Boolean esPrecioCuidado = false;
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public Producto(String nombre, double precio, Boolean esPrecioCuidado) {
		this.precio = precio;
		this.nombre = nombre;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, double precio) {
		this.precio = precio;
		this.nombre = nombre;
	}

	
	public void aumentarPrecio(double factor) {
		precio = precio * factor;
	}
    
}