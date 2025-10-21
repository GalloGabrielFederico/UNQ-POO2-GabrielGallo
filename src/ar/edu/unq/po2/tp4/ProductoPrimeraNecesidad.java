package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	public double calcularPrecio() {
		return this.getPrecio() * (100 - this.descuento)/100;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, int descuento) {
		// TODO Auto-generated constructor stub
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	private int descuento = 0;
	
	

}
