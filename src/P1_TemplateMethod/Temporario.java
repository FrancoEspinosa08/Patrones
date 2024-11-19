package P1_TemplateMethod;

public class Temporario extends Empleado{
	Boolean estaCasadoOHijos;
	int horasTrabajadas;
	@Override
	int sueldoBasico() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	int plusHoras() {
		// TODO Auto-generated method stub
		return 5*horasTrabajadas;
	}

	@Override
	int plusHijosOCasado() {
		// TODO Auto-generated method stub
		if(estaCasadoOHijos) {
			return 100;
		}
		else {
			return 0;
		}
	}

	@Override
	int plusHijos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
