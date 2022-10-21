package mercado;

public class Fruta extends Producto {
    private String unidadDeVenta;

    public Fruta() {
    }
    public Fruta(String nombre, int precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }
    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }
    public String toString(){
        return "Nombre: " + getNombre() + " /// " + "Precio: $" + getPrecio() + " ///" + " Unidad de venta: " + getUnidadDeVenta();
    }
}
