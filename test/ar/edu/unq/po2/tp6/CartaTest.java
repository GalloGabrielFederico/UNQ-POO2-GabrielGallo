package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;

public class CartaTest {
	/*
	Carta trebol4 = new Carta(4, "Trebol");
	Carta picas4 = new Carta(4, "Picas");
	Carta corazones4 = new Carta(4, "Corazones");
	Carta diamantes4 = new Carta(4, "Diamantes");
	Carta trebol5 = new Carta(5, "Trebol");
	Carta trebol6 = new Carta(6, "Trebol");
	Carta trebol7 = new Carta(7, "Trebol");
	
	@Test
	public void IgualdadDePaloTest() {
		assertTrue(trebol4.getPalo() == trebol5.getPalo());
		assertFalse(trebol4.getPalo() == picas4.getPalo());
	}
	
	@Test
	public void IgualdadDeNumeroTest() {
		assertTrue(trebol4.getNumero() == picas4.getNumero());
		assertFalse(picas4.getNumero() == trebol6.getNumero());
	}
	*/
	private Carta jk;
	private Carta kl;
	private Carta aa;
	private Carta ss;
	private Carta dd;
	
	@BeforeEach
	public void setup() {
		this.jk = mock(Carta.class);
		this.kl = mock(Carta.class);
		this.aa = mock(Carta.class);
		this.ss = mock(Carta.class);
		this.dd = mock(Carta.class);
	}
	
	
	@Test
	public void IgualdadDePaloTest() {
		when(this.jk.getPalo()).thenReturn("Trebol");
		when(this.kl.getPalo()).thenReturn("Trebol");
		when(this.aa.getPalo()).thenReturn("Trebol");
		when(this.ss.getPalo()).thenReturn("Picas");
		
		assertTrue(jk.getPalo() == kl.getPalo());
		assertFalse(aa.getPalo() == ss.getPalo());
	}
	
	@Test
	public void IgualdadDeNumeroTest() {
		when(this.jk.getNumero()).thenReturn(4);
		when(this.aa.getNumero()).thenReturn(4);
		when(this.ss.getNumero()).thenReturn(7);
		
		assertTrue(jk.getNumero() == aa.getNumero());
		assertFalse(aa.getNumero() == ss.getNumero());
	}
}
