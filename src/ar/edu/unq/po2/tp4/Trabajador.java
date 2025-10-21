package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public double getTotalPercibido() {
		double totalPercibido = 0.0;
		for(Ingreso ingreso : this.ingresos) {
			totalPercibido = totalPercibido + ingreso.getMonto();
		}
		return totalPercibido;
	}
	
	public double getMontoImponible() {
		return this.getTotalPercibido();
	}
	
	public double getImpuestoAPagar() {
		return 0.02;
	}

}
