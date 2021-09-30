package ar.edu.unlp.oo1.Distribuidora;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(double consumoEnergiaActiva, double consumoEnergiaReactiva, LocalDate fecha) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva =  consumoEnergiaReactiva;
		this.fecha = fecha;
		
	}
	
	public LocalDate fechaDeConsumo() {
		return this.fecha;
	}
	
	public double costoEnBaseA(double precioKWh){
		return this.consumoEnergiaActiva * precioKWh;
	}
	
	public double factorDePotencia() {
		return this.consumoEnergiaActiva / (Math.sqrt(
				(
						Math.pow(this.consumoEnergiaActiva, 2) + Math.pow(this.consumoEnergiaReactiva, 2)
				)
		));
	}

	public double getConsumoDeEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	public double getConsumoEnergiaReactiva() {
		return this.consumoEnergiaReactiva;
	}	
	
	
}
