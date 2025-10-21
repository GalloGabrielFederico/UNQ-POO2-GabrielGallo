package ar.edu.unq.po2.tp7;

public class EnJuego implements EstadosMaquina{

	@Override
	public String ingresarFicha(MaquinaVideoJuego maquina) {
		//System.out.println("no se puede agregar otra ficha");
		return "no se puede agregar otra ficha";
	}

	@Override
	public String presionarInicio(MaquinaVideoJuego maquina) {
		//System.out.println("no se puede presionar inicio");
		return "ya se esta jugando";
	}

}
