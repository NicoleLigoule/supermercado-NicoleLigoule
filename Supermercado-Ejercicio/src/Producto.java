public abstract class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }


    public String toString() {
        int precioSinDecimales = (int) precio;
        return "Nombre: " + nombre + " /// Precio: $" + precioSinDecimales;
    }
}
