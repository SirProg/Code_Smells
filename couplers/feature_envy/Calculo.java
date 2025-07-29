package feature_envy;
public class Calculo {
    double valorImpuesto;
    public double calcularTotal(Pedido pedido) {
        return pedido.getSubtotal() + pedido.getImpuesto();
    }
}
