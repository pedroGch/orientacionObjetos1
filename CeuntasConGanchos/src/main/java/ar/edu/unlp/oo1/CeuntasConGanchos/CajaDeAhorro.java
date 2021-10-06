package ar.edu.unlp.oo1.CeuntasConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		// TODO Auto-generated method stub
		return ((super.getSaldo() - monto) >= 0) ? true : false;
	}
	
	private double recargo(double monto) {
		return monto * 0.02d;
	}
	
	public void depositar(double monto) {
		super.depositar(monto - this.recargo(monto)); 
	}
	
	public boolean extraer(double monto) {
		return super.extraer(monto + this.recargo(monto));
	}
	
	
}
