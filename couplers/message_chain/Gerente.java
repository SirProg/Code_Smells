package message_chain;
public class Gerente {
    private String nombre;
    private String apellido;

    public Gerente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
}
