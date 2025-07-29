public class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private String direccion;
    private double peso;
    private double altura;
    private String grupoSanguineo;
    private String ocupacion;
    private double salario;
    private String empresa;

    public Persona(String nombre, String cedula, int edad, String direccion,
                   double peso, double altura, String grupoSanguineo,
                   String ocupacion, double salario, String empresa) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.direccion = direccion;
        this.peso = peso;
        this.altura = altura;
        this.grupoSanguineo = grupoSanguineo;
        this.ocupacion = ocupacion;
        this.salario = salario;
        this.empresa = empresa;
    }

    public void mostrarIdentificacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
    }

    public void mostrarDatosMedicos() {
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Grupo sanguíneo: " + grupoSanguineo);
    }

    public void mostrarDatosLaborales() {
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Empresa: " + empresa);
        System.out.println("Salario: $" + salario);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public double getSalario() {
        return salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    
}