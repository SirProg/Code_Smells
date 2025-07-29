class Empleado{
	void generarReporte(){/* logica del reporte */}
	void calcularPago(){/* logica para calcular pago */}
	/* ... mas funciones */
}
/* El tener este tipos de metodos viola el principio SOLID
de responsabilidad, tambien se va realizar modificaciones a la
clase si llega a cambiar el metodo en como se realiza las cosas,
siempre dependiendo del tipo del cambio */
