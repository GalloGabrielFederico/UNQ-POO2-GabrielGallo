package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CajaTest {
	List<Cobrable> productos = new ArrayList<>();
	
	Caja caja = new Caja(productos, 0.0);
	
	Agencia jkjk = new MockAgencia();
	
	Producto fideos = new Producto(11, 20, "fideos");
	Producto arroz = new Producto(15, 20, "arroz");
	ProductoCooperativa tomate = new ProductoCooperativa(10, 20, "tomate");
	Impuesto abl = new Impuesto(500, jkjk);
	Servicio luz = new Servicio(20, 10, jkjk);
	
	@Test
	public void cajaTest(){
	caja.registrarCobrable(fideos);
	caja.registrarCobrable(arroz);
	caja.registrarCobrable(tomate);
	caja.registrarCobrable(abl);
	caja.registrarCobrable(luz);
	
	assertEquals(735, caja.getSaldoAPagar());
	}
	

}
