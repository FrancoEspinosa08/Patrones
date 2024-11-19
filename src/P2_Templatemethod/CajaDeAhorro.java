package P2_Templatemethod;

public class CajaDeAhorro extends CuentaBancaria { 
	public CajaDeAhorro(String titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean validacion(int monto) {
		// TODO Auto-generated method stub
		return this.getSaldo()>=monto;
	}
    
} 
