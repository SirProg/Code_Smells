package inappropiate_intimacy;
public class InformacionPersona {
    private Persona persona;

    public InformacionPersona(Persona persona) {
        this.persona = persona;
    }

    public void NombreCompleto() {
        System.out.println("Nombre Completo: " + persona.nombre + " " + persona.apellido);
    }
    public void AnioNacimiento() {
        System.out.println("Año de Nacimiento: " + (2025 - persona.edad));
    }
}
