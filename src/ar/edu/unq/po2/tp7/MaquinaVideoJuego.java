package ar.edu.unq.po2.tp7;

public class MaquinaVideoJuego {
	private EstadosMaquina estadoActual;
	

	public MaquinaVideoJuego() {
		this.estadoActual = new SinFicha();
	}
	
	public String ingresarFicha() {
		return this.estadoActual.ingresarFicha(this);
	}
	
	public String presionarInicio() {
		return this.estadoActual.presionarInicio(this);
	}
	
	public void terminarJuego() {
		System.out.println("juego terminado");
		this.estadoActual = new SinFicha();
	}
	
	public void cambiarEstado(EstadosMaquina estado) {
		this.estadoActual = estado;
	}
}
