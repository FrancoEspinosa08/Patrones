package P1_TemplateMethod;

public class Pasante extends Empleado{
	int horasTrabajadas;
	@Override
	int sueldoBasico() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int plusHoras() {
		// TODO Auto-generated method stub
		return 40*horasTrabajadas;
	}

	@Override
	int plusHijosOCasado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int plusHijos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
