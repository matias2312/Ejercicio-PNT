import mercado.Bebida;
import mercado.Fruta;
import mercado.Higiene;
import mercado.Producto;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    ArrayList<Producto> listaProductos = cargarLista();

    for ( Producto producto : listaProductos){
        System.out.println(producto);
    }

        Collections.sort(listaProductos);

        Producto  productoCaro = listaProductos.get(listaProductos.size() - 1);
        Producto productoBarato = listaProductos.get(0);

        System.out.println("=============================");
        System.out.println("Producto más caro: " + productoCaro.getNombre());
        System.out.println("Producto más barato: " + productoBarato.getNombre());

    }
   public static ArrayList<Producto> cargarLista (){
       Bebida cocaColaZero= new Bebida("Coca-Cola Zero",20,1.5);
       Bebida cocaCola= new Bebida("Coca-Cola",18,1.5);
       Higiene shampoo = new Higiene("Shampoo Sedal", 19, "500ml");
       Fruta frutilla =  new Fruta("Frutilla", 64, "Kilo");

       ArrayList<Producto> listaProductos = new ArrayList<>();
       listaProductos.add(cocaColaZero);
       listaProductos.add(cocaCola);
       listaProductos.add(shampoo);
       listaProductos.add(frutilla);


       return listaProductos;
   }

}
