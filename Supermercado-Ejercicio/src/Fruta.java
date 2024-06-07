public class Fruta extends Producto {
    private String unidadVenta;

    public Fruta(String nombre, double precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + (int) getPrecio() + " /// Unidad de venta: " + unidadVenta;
    }
}
