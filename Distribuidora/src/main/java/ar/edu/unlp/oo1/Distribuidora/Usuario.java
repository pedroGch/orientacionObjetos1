package ar.edu.unlp.oo1.Distribuidora;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List <Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	public void agregarMedicion(Consumo consumo) {
			consumos.add(consumo);
	}
	
	private Optional<Consumo> ultimoConsumoAsOptional() {
		//retorna un Optional, ya que puede no tener consumos
		return this.consumos
			.stream()
			.max((Consumo c1, Consumo c2) -> c1.fechaDeConsumo().compareTo(c2.fechaDeConsumo()));
	}
	
	//devuelve un valor double que representa el ultimo consumo de energia activa
	public double ultimoConsumoActiva() {
		return this.ultimoConsumoAsOptional()
			.map((Consumo c) -> c.getConsumoDeEnergiaActiva())
			.orElse(0d);
	}
	
	//retorna un objeto que representa el ultimo consumo
	public Consumo ultimoConsumo() {
		return this.ultimoConsumoAsOptional().orElse(null);
	}
	
	//retorna una factura con usuario como this y el costo a facturar por la energia
	public Factura faturarEnBase(Double precioKWh) {
		Consumo  c = this.ultimoConsumo();		
		Factura f = new Factura(this, c.costoEnBaseA(precioKWh));
		this.facturas.add(f);
		return f;
	}
	
	private Optional<Factura> buscarUltimaFactura() {
		return this.facturas.stream().max((Factura f1, Factura f2) -> f1.getFecha().compareTo(f2.getFecha()));		
	}
	
	public List<Factura> facturas() {
		return this.facturas;
	}
	
	public double dameUltimoFactorDePotencia() {
		return this.ultimoConsumoAsOptional()
				.map((Consumo c) -> c.factorDePotencia())
				.orElse(0d);
	}
	
}
