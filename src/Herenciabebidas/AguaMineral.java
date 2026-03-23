package Herenciabebidas;

public class AguaMineral extends Producto {
    private double volumen;
    private String origen;
    



    @Override
    public double getpreciofinal() {
        return getprecio();
    }
    @Override
    public void mostrar() {
        System.out.println("Agua Mineral:");
        System.out.println("ID: " + getId());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Precio: " + getprecio());
        System.out.println("Volumen: " + volumen);
        System.out.println("Origen: " + origen);
    }

}
