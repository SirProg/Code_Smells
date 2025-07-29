public class Cliente {
    private String nombre;
    private String direccion;
    private String ciudad;

    public Cliente(String nombre, String direccion, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public void imprimirEtiquetaEnvio() {
        System.out.println(nombre);
        System.out.println(direccion);
        System.out.println(ciudad);
    }
}
