package ar.edu.unq.po2.tp7;

public class SinFicha implements EstadosMaquina{

	@Override
	public String ingresarFicha(MaquinaVideoJuego maquina) {
		maquina.cambiarEstado(new Jugar1Ficha());
		return "se ingreso 1 ficha";
	}

	@Override
	public String presionarInicio(MaquinaVideoJuego maquina) {
		//System.out.println("ingrese fichas");
		return "ingrese 1 ficha";
	}
	
}
