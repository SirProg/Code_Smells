public class Pedido {
    private String nombreCliente;
    private String direccionCliente;
    private String ciudadCliente;

    public Pedido(String nombreCliente, String direccionCliente, String ciudadCliente) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.ciudadCliente = ciudadCliente;
    }

    public void imprimirEnvio() {
        System.out.println(nombreCliente);
        System.out.println(direccionCliente);
        System.out.println(ciudadCliente);
    }
}
