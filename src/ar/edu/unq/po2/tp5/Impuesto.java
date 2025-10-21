package ar.edu.unq.po2.tp5;

public class Impuesto implements Cobrable{
	private double tasaDeServicios;
	
	private Agencia agencia;
	

	@Override
	public double getMontoAPagar() {
		return tasaDeServicios;
	}

	@Override
	public void registrar() {
		this.agencia.registrarPago(new Factura(this.getMontoAPagar()));
	}

	public Impuesto(double tasaDeServicios, Agencia agencia) {
		this.tasaDeServicios = tasaDeServicios;
		this.agencia = agencia;
	}

}
