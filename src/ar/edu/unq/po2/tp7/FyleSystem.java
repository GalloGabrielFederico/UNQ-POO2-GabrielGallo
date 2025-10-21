package ar.edu.unq.po2.tp7;

import java.time.LocalDate;

public interface FyleSystem {
	public int totalSize();
	
	public void printStructure();
	
	public FyleSystem lastModified();
	
	public FyleSystem oldestElement();
	
	public String getNombre();
	
	public LocalDate getFecha();
}
