package Veterinaria;

public class Dueno {
	private String nombre;
	private String dir;
	private String colonia;
	private String ciudad;
	private String tel;
	private String mail;
	
	public Dueno(String nombre, String dir, String tel, 
			       String mail, String colonia) {
		
		this.nombre = nombre;
		this.dir = dir;
		this.tel = tel;
		this.mail = mail;
		this.ciudad = "Mexicali, B.C";
		this.colonia= null;
	}
	public Dueno(String nombre) {
	
	this.nombre = nombre;
	this.dir = "";
	this.tel = "";
	this.mail = "";
	this.ciudad = "Mexicali, B.C";
	this.colonia= "";
}
	public Dueno(String nombre, String tel) {
		
		this.nombre = nombre;
		this.tel = tel;
	}
	public Dueno(	) {
	this.nombre = null;
	this.dir = null;
	this.tel = null;
	this.mail = null;
	this.ciudad = "Mexicali";
	this.colonia= null;
}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Dueno [nombre=" + nombre + ", dir=" + dir
				+ ", colonia=" + colonia + ", ciudad=" 
				+ ciudad + ", tel="
				+ tel + ", mail=" + mail + "]";
	}
	
	
	

}
