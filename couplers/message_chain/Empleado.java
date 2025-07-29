package message_chain;
public class Empleado {
    private Departamento departamentoAsignado;

    public Empleado(Departamento departamentoAsignado) {
        this.departamentoAsignado = departamentoAsignado;
    }

    public Departamento getDepartamentoAsignado() {
        return departamentoAsignado;
    }
    public String getNombreGerente() {
        return getDepartamentoAsignado().getGerente().getNombre();
    }
}
