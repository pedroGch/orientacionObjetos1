package ar.edu.unlp.oo1.Inversor;

public class InversionEnAcciones  implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario ) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
				
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getValorunitario() {
		return this.valorUnitario;
	}
	
	@Override
	public double valorActual() {
		// TODO Auto-generated method stub
		return this.getValorunitario() * this.getCantidad();
	}
	
	
	

}
