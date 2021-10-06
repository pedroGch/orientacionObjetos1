package ar.edu.unlp.oo1.Solidos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		 this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza (Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public List<Pieza> dameTodasPiezasDeUnMaterial(String nombreDeMaterial){
		return this.piezas.stream()
				.filter( p -> p.getMaterial() == nombreDeMaterial)
				.collect(Collectors.toList());
	}
	
	//Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro'). 
	//Retorna la suma de los volúmenes de todas las piezas hechas en ese material
	public double getVolumenDeMaterial( String nombreDeMaterial) {
		return 0;
	}
	
}
