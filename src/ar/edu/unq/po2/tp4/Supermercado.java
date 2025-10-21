package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	public Supermercado(String nombre, String direccion) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.direccion = direccion;
	}

	private String nombre;
	
	private String direccion;
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double precioAcumulado = 0.0;
		for(Producto producto : this.productos) {
			precioAcumulado = precioAcumulado + producto.getPrecio();
		}
		return precioAcumulado;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

}
