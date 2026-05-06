package Mconsultas;

public class Veterinario {
    private String nombre;
    private String APaterno;
    private String AMaterno;
    private String calle;
    private String colonia;
    private String ciudad;
    private String telefono;
    private String mail;
    private String cedula;
    
    public Veterinario(String nombre, String aPaterno, String aMaterno, String calle, String colonia, String ciudad,
            String telefono, String mail, String cedula) {
        this.nombre = nombre;
        APaterno = aPaterno;
        AMaterno = aMaterno;
        this.calle = calle;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.mail = mail;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String aPaterno) {
        APaterno = aPaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String aMaterno) {
        AMaterno = aMaterno;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Veterinario [nombre=" + nombre + ", APaterno=" + APaterno + ", AMaterno=" + AMaterno + ", calle="
                + calle + ", colonia=" + colonia + ", ciudad=" + ciudad + ", telefono=" + telefono + ", mail=" + mail
                + ", cedula=" + cedula + "]";
    }

}
