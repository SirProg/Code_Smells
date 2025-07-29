class Empleado{
	private String address;
	String formatoDireccion(){return address.toString();}
}

class Orden{
	String getEtiquetaEnvio(){return empleado.address.toString();}
}

class Factura{
	String  getDireccionEnvio(){return empleado.address.toString();}
}
/* En caso de que llegue a ver cambios en como se ve representado la direccion
implica modificar esas clases y demas clases que hagan uso de este atributo */

