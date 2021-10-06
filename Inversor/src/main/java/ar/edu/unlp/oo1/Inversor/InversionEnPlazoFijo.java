package ar.edu.unlp.oo1.Inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InversionEnPlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montodeDepositado;
	private double porcentajeDeInteres;
	
	public InversionEnPlazoFijo(double montodeDepositado , double porcentajeDeInteres ) {
		this.montodeDepositado = montodeDepositado;
		this.porcentajeDeInteres = porcentajeDeInteres;
	}
	
	public double getPorcentajeDeInteres () {
		return this.porcentajeDeInteres;
	}
	public double getMontodeDepositado () {
		return this.montodeDepositado;
	}
	public LocalDate getFechaDeConstitucion () {
		return this.fechaDeConstitucion;
	}
	
	public double getCantidadDeDias() {
		return ChronoUnit.DAYS.between(LocalDate.now(),this.getFechaDeConstitucion());

	}
	@Override
	public double valorActual() {
		// TODO Auto-generated method stub
		return this.montodeDepositado * (1 + this.porcentajeDeInteres/100 * this.getCantidadDeDias());
	}
	
	

}
