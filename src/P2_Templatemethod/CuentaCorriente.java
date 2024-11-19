package P2_Templatemethod;

public class CuentaCorriente extends CuentaBancaria { 
	private int limite; 
	public CuentaCorriente(String titular, int limite){ 
	    super(titular); 
	    this.limite=limite; 
	} 
	public int getLimite(){ 
	    return this.limite; 
	} 
	@Override
	public boolean validacion(int monto) {
		// TODO Auto-generated method stub
		return this.getSaldo()>=monto && this.getLimite()>=monto;
	} 
} 

