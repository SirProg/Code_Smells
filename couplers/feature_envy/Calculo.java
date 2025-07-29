package feature_envy;
public class Calculo {
    public double calcularTotal(Pedido pedido) {
        return pedido.getSubtotal() + pedido.getImpuesto();
    }
}
