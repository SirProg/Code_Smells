public class Animal{
	private String nombre;
	private String raza;
	private String edad;

	public Animal(String nombre, String raza, String edad){
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	public void correr(){
		System.out.println(nombre + " corre");
	}
	public void volar(){
		System.out.println(nombre + " vuela");
	}
}
