package feature_envy;
public class Pedido {
    private String cliente;
    private String produto;
    private double subtotal;
    private double impuesto;

    public Pedido(String cliente, String produto, double subtotal, double impuesto) {
        this.cliente = cliente;
        this.produto = produto;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProduto() {
        return produto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }
}