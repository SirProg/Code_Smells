package middle_man;

public class Controlador {
    private Servicio servicio;

    public Controlador(Servicio servicio) {
        this.servicio = servicio;
    }

    public void procesarServicio() {
        servicio.procesar();
    }
    public static void main(String[] args) {
        Servicio servicio = new Servicio(1, "Servicio de Prueba", 100.0);
        Controlador controlador = new Controlador(servicio);
        controlador.procesarServicio();
    }
}
