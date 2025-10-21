package ar.edu.unq.po2.tp7;

public class Jugar1Ficha implements EstadosMaquina{

	@Override
	public String ingresarFicha(MaquinaVideoJuego maquina) {
		maquina.cambiarEstado(new Jugar2Fichas());
		return "se ingrso otra ficha";
	}

	@Override
	public String presionarInicio(MaquinaVideoJuego maquina) {
		maquina.cambiarEstado(new EnJuego());
		return "jugando un jugador";
	}

}
