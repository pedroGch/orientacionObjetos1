package ar.edu.unlp.oo1.Distribuidora;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	//private double descuento = 0;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura(Usuario usuario, double montoEnergiaActiva) {
		this.usuario = usuario;
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.fecha = LocalDate.now();
		if (usuario.dameUltimoFactorDePotencia() > 0.8) {
			this.descuento = montoEnergiaActiva * 0.10;
		}else {
			this.descuento = 0;
		}
	}
	
	public double montoTotal() {
		return this.montoEnergiaActiva - this.descuento;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
}
