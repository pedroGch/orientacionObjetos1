package ar.edu.unlp.oo1.Distribuidora;

import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios;
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	/*
	 * necesito recorrer cada usuario
	 * a cada uno pedirle  el valor de su ultimo consumo de energia activa 
	 * sumar cada valor retornado 
	 * devolver la sumatoria
	 * */
	public double consumoTotaActiva() {
		//necesito recorrer cada usuario 
		return this.usuarios.stream().mapToDouble(u -> u.ultimoConsumoActiva()).sum();
		
	}
	
	public void precioKWh(double precio) {
		this.precioKWh = precio;
	}
	
	/*
	 * necesito recorrer todos los usuarios
	 * a cada usuario pedirle que facture
	 * guardar la factura generada por cada usuario
	 * retornar la factura
	 * */
	public List<Factura>  facturar() {
		return this.usuarios.stream().map( u -> u.faturarEnBase(this.precioKWh)).collect(Collectors.toList());
		
	}
}
