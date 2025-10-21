package ar.edu.unq.po2.tp5;

public class Producto implements Cobrable{
	protected double precio;
	
	private int stock;
	
	private String nombre;
	
	
	public boolean hayStock() {
		return stock > 0;
	}
	
	public Producto(double precio, int stock, String nombre) {
		this.precio = precio;
		this.stock = stock;
		this.nombre = nombre;
	}

	@Override
	public double getMontoAPagar() {
		return precio;
	}

	@Override
	public void registrar() {
		if(this.hayStock()) {
			stock = stock -1;
		}
		else {
			System.out.println("no hay stock de " + this.nombre);
		}
	}

}
