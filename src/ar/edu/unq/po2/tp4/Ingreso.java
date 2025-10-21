package ar.edu.unq.po2.tp4;

public class Ingreso {
	int mes;
	String concepto;
	double monto;
	
	public double getMonto() {
		return monto - this.getMontoImponible();
	}
	
	public double getMontoImponible(){
		return monto*0.02;
	}

}
