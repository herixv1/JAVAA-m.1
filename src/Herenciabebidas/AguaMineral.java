package Herenciabebidas;

public class AguaMineral extends Producto {

    private String origen;

    public AguaMineral(int id, String descripcion, double tamanio,String unidadMedida, int unidadesExistencia,double precio, String marca, String origen) {
        super(id, descripcion, tamanio, unidadMedida,unidadesExistencia, precio, marca);
        this.origen = origen;
    }

    @Override
    public double getPrecioFinal() {
        return getPrecio();
    }

    @Override
    public void mostrarInfo() {
        System.out.println(">>> AGUA MINERAL");
        super.mostrarInfo(); 
        System.out.println("Origen : " + origen);
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

   
   
}
