package Herenciabebidas;

public abstract class Producto {

    private int id;
    private String descripcion;
    private double tamanio;          
    private String unidadMedida;     
    private int unidadesExistencia;
    private double precio;
    private String marca;

    public Producto(int id, String descripcion, double tamanio,String unidadMedida, int unidadesExistencia,double precio, String marca) {
        this.id = id;           
        this.descripcion = descripcion;
        this.tamanio = tamanio;
        this.unidadMedida = unidadMedida;
        this.unidadesExistencia = unidadesExistencia;
        this.precio = precio;
        this.marca = marca;
    }

    public abstract double getPrecioFinal();

    public void mostrarInfo() {
        System.out.println("-----------------------------");
        System.out.println("ID          : " + id);
        System.out.println("Descripcion : " + descripcion);
        System.out.println("Tamaño      : " + tamanio + " " + unidadMedida);
        System.out.println("Existencias : " + unidadesExistencia + " unidades");
        System.out.println("Precio base : " + precio + " €");
        System.out.println("Marca       : " + marca);
        System.out.println("Precio final: " + getPrecioFinal() + " €");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getUnidadesExistencia() {
        return unidadesExistencia;
    }

    public void setUnidadesExistencia(int unidadesExistencia) {
        this.unidadesExistencia = unidadesExistencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}