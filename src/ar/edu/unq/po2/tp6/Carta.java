package ar.edu.unq.po2.tp6;

public class Carta {

	private int numero;
	
	private String palo;

	public String getPalo() {
		return palo;
	}
	
	public int getNumero() {
		return numero;
	}

	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	

}
