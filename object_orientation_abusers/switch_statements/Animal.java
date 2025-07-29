public class Animal{
	private String nombre;
	private String raza;
	private int edad;
	private in tipo;

	public Animal(/*...*/){
		/*...*/
	}

	public hacerSonido(){
		switch(tipo){
			case 1: System.out.println("woof"); break;
			case 2: System.out.println("miau"); break;
			case 3: System.out.println("muuu"); break;
		}
	}

}
