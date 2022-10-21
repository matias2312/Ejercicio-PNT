package mercado;

public class Bebida extends Producto{
    private double litros;

    public Bebida() {
    }
    public Bebida(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }
    public String toString(){
        return "Nombre: " + getNombre() + " /// " + "Litros: " + getLitros() + " ///" + " Precio: $" + getPrecio();
    }
    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}

