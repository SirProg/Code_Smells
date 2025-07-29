package middle_man;
public class Servicio {
    private int id;
    private String descripcion;
    private double costo;

    public Servicio(int id, String descripcion, double costo) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }
    public void procesar() {
        // Lógica para procesar el servicio
        System.out.println("Procesando servicio: " + descripcion);
    }
}
