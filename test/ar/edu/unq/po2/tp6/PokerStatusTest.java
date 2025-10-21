package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PokerStatusTest {
	
		PokerStatus juego = new PokerStatus();
		String carta1 = "3T";
		String carta2 = "10T";
		String carta3 = "6T";
		String carta4 = "JT";
		String carta5 = "8T";
		String carta6 = "3P";
		String carta7 = "3C";
		String carta8 = "3D";
		
		/*
		@Test
		public void PokerStatusTest() {
			assertFalse(juego.verificar(carta1, carta2, carta3, carta4, carta5));
		}
		
		@Test
		public void PokerStatusTest2() {
			assertTrue(juego.verificar(carta1, carta8, carta6, carta7, carta2));
		}
		*/
		
		@Test
		public void TrioTest() {
			assertEquals("trio", juego.verificar(carta1, carta6, carta7, carta2, carta3));
		}
		
		@Test
		public void PokerTest() {
			assertEquals("poker", juego.verificar(carta1, carta6, carta7, carta8, carta3));
		}
		
		@Test
		public void ColorTest() {
			assertEquals("color", juego.verificar("3D", "10D", "6D", "JD", "8D"));
		}
		
		@Test
		public void NadaTest() {
			assertEquals("nada", juego.verificar("3T", "10D", "6C", "JP", "8T"));
		}
	
}

