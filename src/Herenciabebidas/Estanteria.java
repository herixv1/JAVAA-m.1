package Herenciabebidas;

public class Estanteria {

    private Producto[] productos;
    private int cantidad;

    public Estanteria(int capacidadMaxima) {
        productos = new Producto[capacidadMaxima];
        cantidad = 0;
    }

    public boolean agregar(Producto p) {
        if (cantidad < productos.length) {
            productos[cantidad] = p;
            cantidad++;
            return true;
        }
        System.out.println("Estanteria llena, no se puede agregar.");
        return false;
    }

    public void reducirCantidad() {
        if (cantidad > 0) cantidad--;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}