package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class MaquinaVideoJuegoTest {
	MaquinaVideoJuego atari;
	
	@BeforeEach
	public void setUp() {
		atari = new MaquinaVideoJuego();
	}
	
	@Test
	public void test1() {
		assertEquals("ingrese 1 ficha", atari.presionarInicio());
	}
	
	@Test
	public void test2() {
		assertEquals("se ingreso 1 ficha",atari.ingresarFicha());
		assertEquals("jugando un jugador", atari.presionarInicio());
	}
	
	@Test
	public void test3() {
		atari.ingresarFicha();
		assertEquals("se ingrso otra ficha",atari.ingresarFicha());
		assertEquals("juegando 2 jugadores", atari.presionarInicio());
	}
	
	@Test
	public void test4() {
		atari.ingresarFicha();
		atari.ingresarFicha();
		assertEquals("no se puede agregar otra ficha",atari.ingresarFicha());
		assertEquals("ya se esta jugando", atari.presionarInicio());
	}
}
