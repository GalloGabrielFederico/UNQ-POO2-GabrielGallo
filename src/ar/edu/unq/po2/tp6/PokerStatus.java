package ar.edu.unq.po2.tp6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class PokerStatus {

	public String verificar(String c1, String c2, String c3, String c4, String c5) {
		List<String> cartas = Arrays.asList(c1, c2, c3, c4, c5);
		
		if(this.isPoker(cartas)) {
			return "poker";
		}
		else if(this.isTrio(cartas)) {
			return "trio";
		}
		else if(this.isColor(cartas)) {
			return "color";
		}
		
		return "nada";
	}
	
	public boolean isPoker(List<String> cartas) {
		List<String> valores = cartas.stream().map(carta -> carta.substring(0, carta.length() -1)).collect(Collectors.toList());
		
		for(String valor : valores) {
			long count = valores.stream().filter(v -> v.equals(valor)).count();
			
			if(count >= 4){
				return true;
			}
		}
		return false;
	}
	
	public boolean isTrio(List<String> cartas) {
		List<String> valores = cartas.stream().map(carta -> carta.substring(0, carta.length() -1)).collect(Collectors.toList());
		
		for(String valor : valores) {
			long count = valores.stream().filter(v -> v.equals(valor)).count();
			
			if(count == 3){
				return true;
			}
		}
		return false;
	}
	
	public boolean isColor(List<String> cartas) {
		List<String> palos = cartas.stream().map(carta -> carta.substring(carta.length() -1, carta.length())).collect(Collectors.toList());
		
		for(String palo : palos) {
			long count = palos.stream().filter(p -> p.equals(palo)).count();
			
			if(count == 5) {
				return true;
			}
		}
		return false;
	}
	

}

