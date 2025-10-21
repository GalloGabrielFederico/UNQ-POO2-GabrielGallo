package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Cobrable> items = new ArrayList<Cobrable>();
	private double saldoAcumulado = 0.0;
	
	public void registrarCobrable(Cobrable item) {
			saldoAcumulado = saldoAcumulado + item.getMontoAPagar();
			item.registrar();
			items.add(item);
	}
	

	public Caja(List<Cobrable> items, double saldoAcumulado) {
		this.items = items;
		this.saldoAcumulado = saldoAcumulado;
	}


	
	public double getSaldoAPagar() {
		return saldoAcumulado;
	}
	
	

}
