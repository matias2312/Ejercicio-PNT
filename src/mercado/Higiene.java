package mercado;

public class Higiene extends Producto{
    private String contenido;

    public Higiene() {
    }
    public Higiene(String nombre, int precio, String contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String toString(){
        return "Nombre: " + getNombre() + " /// " + "Contenido: " + getContenido() + " ///" + " Precio: $" + getPrecio();
    }
}
