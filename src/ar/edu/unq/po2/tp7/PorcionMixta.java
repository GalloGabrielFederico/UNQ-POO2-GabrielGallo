package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

public class PorcionMixta extends PorcionProductiva{
	private List<PorcionProductiva> cultivos = new ArrayList<>();
	
	public PorcionMixta(PorcionProductiva p1, PorcionProductiva p2, PorcionProductiva p3, PorcionProductiva p4) {
		cultivos.add(p1);
		cultivos.add(p2);
		cultivos.add(p3);
		cultivos.add(p4);
	}

	@Override
	public double getGananciaSoja() {
		double gananciaTotalSoja = 0;
		for(PorcionProductiva cultivo : this.cultivos) {
			gananciaTotalSoja += cultivo.getGananciaSoja();
		}
		return gananciaTotalSoja / 4;
	}

	@Override
	public double getGananciaTrigo() {
		double gananciaTotalTrigo = 0;
		for(PorcionProductiva cultivo : this.cultivos) {
			gananciaTotalTrigo += cultivo.getGananciaTrigo();
		}
		return gananciaTotalTrigo / 4;
	}
	
	

}
