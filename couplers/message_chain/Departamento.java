package message_chain;
public class Departamento {
    private Gerente gerente;
    private int numeroDepartamento;

    public Departamento(Gerente gerente, int numeroDepartamento) {
        this.gerente = gerente;
        this.numeroDepartamento = numeroDepartamento;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }
}
