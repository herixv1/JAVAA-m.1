package Herenciabebidas;


public class BebidaAzucarada extends Producto {

    private double porcentajeAzucar;
    private boolean tienePromocion;  

    public BebidaAzucarada(int id, String descripcion, double tamanio,String unidadMedida, int unidadesExistencia,double precio, String marca,double porcentajeAzucar, boolean tienePromocion) {
        super(id, descripcion, tamanio, unidadMedida,unidadesExistencia, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.tienePromocion   = tienePromocion;
    }

    @Override
    public double getPrecioFinal() {
        if (tienePromocion) {
            return getPrecio() * 0.90;
        } else {
            return getPrecio();
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println(">>> BEBIDA AZUCARADA");
        super.mostrarInfo(); 
        System.out.println("% Azucar    : " + porcentajeAzucar + "%");
        System.out.println("Promocion   : " + (tienePromocion ? "Si (10% descuento)" : "No"));
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isTienePromocion() {
        return tienePromocion;
    }

    public void setTienePromocion(boolean tienePromocion) {
        this.tienePromocion = tienePromocion;
    }


    

    

}