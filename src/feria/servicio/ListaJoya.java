package feria.servicio;

import java.util.ArrayList;
import java.util.List;

import feria.clases.Joya;

public class ListaJoya {
	private static List<Joya> joyas = new ArrayList<Joya>();
	
	public static void add(Joya j) {
		joyas.add(j);
	}
	
	public static List<Joya> getAll(){
		return joyas;
	}
	
}
