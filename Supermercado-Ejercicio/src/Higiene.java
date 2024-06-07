public class Higiene extends Producto {
    private int contenido;

    public Higiene(String nombre, int contenido, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + contenido + "ml /// Precio: $" + (int) getPrecio();
    }
}
