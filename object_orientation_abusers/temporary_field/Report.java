public class Report{
	private String tempCabecera;

	public void generarResumen(){
		tempCabecera = "Resumen del mes";
		System.out.println(tempCabecera);
	}

	public void imprimirReporte(){
		//Dentro no se hace uso del tempCabecera
	}
	// ... No se usa nunca el tempCabecera
}
