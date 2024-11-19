package P1_TemplateMethod;

public class Planta extends Empleado{
	int cantHijos;
	@Override
	int sueldoBasico() {
		// TODO Auto-generated method stub
		return 3000;
	}

	@Override
	int plusHoras() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int plusHijosOCasado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int plusHijos() {
		// TODO Auto-generated method stub
		return 150*cantHijos;
	}

}
