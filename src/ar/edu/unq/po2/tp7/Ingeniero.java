package ar.edu.unq.po2.tp7;

public class Ingeniero extends Caminante{
	private int lajas;
	
	public Ingeniero(int lajas) {
		this.lajas = lajas;
	}
	
	@Override
	public void caminar() {
		if(lajas > 0) {
			System.out.println("camino poniendo lajas");
		}
		else {
			System.out.println("camino sin poner lajas");
		}
	}
	

}
