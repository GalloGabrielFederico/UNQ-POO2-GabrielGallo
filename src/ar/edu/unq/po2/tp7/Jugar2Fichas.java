package ar.edu.unq.po2.tp7;

public class Jugar2Fichas implements EstadosMaquina{

	@Override
	public String ingresarFicha(MaquinaVideoJuego maquina) {
		//System.out.println("no se puede agregar otra ficha");
		return "no se puede agregar otra ficha";
	}

	@Override
	public String presionarInicio(MaquinaVideoJuego maquina) {
		maquina.cambiarEstado(new EnJuego());
		return "juegando 2 jugadores";
	}

}
