public class Perro extends Animal{
	private String nombre;
	private String raza;
	private int edad;

	public Perro(String nombre, String raza, int edad){
		super(nombre,raza,edad);
	}
	
	@Override
	public void correr(){
		System.out.println(nombre + " corre");
	}
	@Override
	public void volar(){
		throw new UnsupportedOperationException("Los perros no peuden volar");
	}
}
