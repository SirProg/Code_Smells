public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;
    private int stock;
    private String proveedor;
    private String codigoBarras;

    public Producto(String nombre, String descripcion, double precio,
                    String categoria, int stock, String proveedor, String codigoBarras) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.proveedor = proveedor;
        this.codigoBarras = codigoBarras;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " (" + categoria + ")");
        System.out.println("Precio: $" + precio + ", Stock: " + stock);
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Código: " + codigoBarras);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    
}
