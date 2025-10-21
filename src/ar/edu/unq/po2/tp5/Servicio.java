package ar.edu.unq.po2.tp5;

public class Servicio implements Cobrable{
	private double costoPorUnidad;
	
	private int cantUnidades;
	
	private Agencia agencia;

	@Override
	public double getMontoAPagar() {
		return costoPorUnidad * cantUnidades;
		
	}

	@Override
	public void registrar() {
		this.agencia.registrarPago(new Factura(this.getMontoAPagar()));
		
	}

	public Servicio(double costoPorUnidad, int cantUnidades, Agencia agencia) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidades = cantUnidades;
		this.agencia = agencia;
	}

}
