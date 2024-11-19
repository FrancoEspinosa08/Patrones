package P1_TemplateMethod;

public abstract class Empleado {
	public double sueldo() {
		double sueldoNeto = this.sueldoBasico()+this.plusHoras()+this.plusHijosOCasado()
		+this.plusHijos();
		return sueldoNeto - (sueldoNeto*0.13);
	} //template
	abstract int sueldoBasico();
	
	abstract int plusHoras();
	
	abstract int plusHijosOCasado();
	
	abstract int plusHijos();
}

/*
Sueldos recargado 
Una empresa realiza periódicamente los pagos de sueldos y cargas de cada uno de sus 
empleados. En la empresa los empleados están organizados en tres tipos: Temporarios, 
Pasantes y de Planta. El sueldo de un empleado Temporario está determinado por el pago 
de $5 por hora que trabajó más el sueldo básico que es de $1000, además se le paga $100 
si posee hijos y/o está casado. A los Pasantes se les paga $40 las horas trabajadas en el 
mes. Por último a los empleados de Planta se les paga un sueldo básico de $ 3000 y un 
plus por cada hijo que posea de $ 150 cada hijo. Por otro lado, de cada sueldo se deben 
descontar en conceptos de aportes y obra social un 13 % del sueldo. 
Modele la jerarquía de Empleados de forma tal que cualquier empleado puede responder 
al mensaje #sueldo. Utilice template method para su solución e indique los roles 
participantes. */