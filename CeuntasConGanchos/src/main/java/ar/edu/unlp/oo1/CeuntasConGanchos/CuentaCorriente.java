package ar.edu.unlp.oo1.CeuntasConGanchos;

public class CuentaCorriente extends Cuenta {

	double limiteDeDescubierto;
	
	public CuentaCorriente() {
		this.limiteDeDescubierto = 0;
	}
	
	public void setDescubierto (double monto) {
		this.limiteDeDescubierto = monto;
	}
	
	public double getDescubierto() {
		return this.limiteDeDescubierto;
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		// TODO Auto-generated method stub
		return ((super.getSaldo() + this.getDescubierto()) >= 0) ? true : false;
	}
	
	
	

}
