public class Bebida extends Producto {
    private double litros;

    public Bebida(String nombre, double litros, double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        String litrosFormateados = String.format("%.1f", litros).replace(',', '.');
        return "Nombre: " + getNombre() + " /// Litros: " + litrosFormateados + " /// Precio: $" + (int) getPrecio();
    }
}
