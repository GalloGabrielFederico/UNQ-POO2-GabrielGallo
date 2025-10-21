package ar.edu.unq.po2.tp7;

public class PorcionPura extends PorcionProductiva{
	private String nombre;

	public PorcionPura(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double getGananciaSoja() {
		return this.nombre == "Soja" ? 500 : 0;
	}

	@Override
	public double getGananciaTrigo() {
		return this.nombre == "Trigo" ? 300 : 0;
	}

	
}
