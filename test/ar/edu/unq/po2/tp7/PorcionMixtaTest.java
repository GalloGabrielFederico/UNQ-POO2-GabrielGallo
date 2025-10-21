package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class PorcionMixtaTest {
	public PorcionPura soja = new PorcionPura("Soja");
	public PorcionPura trigo = new PorcionPura("Trigo");
	
	public PorcionMixta algo = new PorcionMixta(soja, soja, soja, trigo);
	
	@Test
	public void porcionPura() {
		assertEquals(500, soja.getGananciaSoja());
		assertEquals(0, soja.getGananciaTrigo());
		assertEquals(300, trigo.getGananciaTrigo());
		assertEquals(0, trigo.getGananciaSoja());
	}
	
	@Test
	public void porcionMixta() {
		assertEquals(375, algo.getGananciaSoja());
		assertEquals(75, algo.getGananciaTrigo());
	}
	
}

