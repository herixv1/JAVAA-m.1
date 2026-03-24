package Veterinaria;

import java.time.LocalDate;
import java.time.Period;

public class Mascota implements Comparable<Mascota>{
	     // variables de instancia o miembro de una clase, definen las caracteristicas del objeto
   private int idMascota;
   private String nombre;
   private String raza;
   private String color;
   private String genero;
   private LocalDate nacio;
   private LocalDate murio;
   private int numConsulta;
   private Dueno duenio;
   private int caso;
   
   		// constructor metodo que se utiliza para la inicializacion y creacion de objeto
       // este metodo se ejecuta automaticamente al crear el objeto
   public Mascota(int idMascota, String nombre, String raza, String color, String genero, LocalDate nacio,
		LocalDate murio) {
	this.idMascota = idMascota;
	this.nombre = nombre;
	this.raza = raza;
	this.color = color;
	this.genero = genero;
	this.nacio = nacio;
	this.murio = murio;
	 this.numConsulta  = 0;
	this.duenio = new Dueno();
	this.caso = 1;
	
   }
   		
   public Mascota(int idMascota, String nombre, String raza,LocalDate nacio, Dueno duenio) {
	this.idMascota = idMascota;
	this.nombre = nombre;
	this.raza = raza;
	this.duenio = duenio ;
	this.nacio = nacio;
	this.caso = 1;
   }

   public Mascota(String nombre) {
	this();
	this.nombre = nombre;
   }
        // cuando exista mas de un metodo debes de escribir el constructor sin parametros si lo ocupas asi
   public Mascota() {
		this.idMascota = 0;
		this.nombre = null;
		this.raza = null;
		this.color = null;
		this.genero = null;
		this.nacio = null;
		this.murio = null;
		this.duenio = new Dueno();
		this.caso = 1;
	   }
   
       public int getNumConsulta() {
	return numConsulta;
}

   public void setNumConsulta(int numConsulta) {
	this.numConsulta = numConsulta;
   }

   public int getCaso() {
	return caso;
   }

   public void setCaso(int caso) {
	this.caso = caso;
   }

   // para accesar alos miembros de la clase que tienen visivilidad privada se deben de llegar a ellos por Setting y Getting 
       // los get te regresan el valor almacenado en este atributo o variable de instancia
   public int getIdMascota() {
	return idMascota;
   }
   
   		// el set se utiliza para asignar el valor la variable de instancia 
   public void setIdMascota(int idMascota) {
	this.idMascota = idMascota;
   }
   public String getNombre() {
	return nombre;
   }
   public void setNombre(String nombre) {
	this.nombre = nombre;
   }
   public String getRaza() {
	return raza;
   }
   public void setRaza(String raza) {
	this.raza = raza;
   }
   public String getColor() {
	return color;
   }
   public void setColor(String color) {
	this.color = color;
   }
   public String getGenero() {
	return genero;
   }
   public void setGenero(String genero) {
	this.genero = genero;
   }
   public LocalDate getNacio() {
	return nacio;
   }
   public void setNacio(LocalDate nacio) {
	this.nacio = nacio;
   }
   public LocalDate getMurio() {
	return murio;
   }
   public void setMurio(LocalDate murio) {
	this.murio = murio;
   }
   public Dueno getDuenio() {
	return duenio;
   }
   public void setDuenio(Dueno duenio) {
	this.duenio = duenio;
   }
   public void setNumConsulta() {
	   this.numConsulta++;
   }
   
   public int getNumComsulta() {
	   return this.numConsulta;
   }
   public void contarCons() {
	   this.numConsulta++;
   }
   
   public int calcularEdad() {
	   int edad=0;
	   Period periodo = Period.between(this.nacio, LocalDate.now());
       edad = periodo.getYears();
	   return edad;
   }
   		// este metodo es creado para enviar el estado del objeto (solo algunos valores)
   public String presentaMascota() {
	   return  this.idMascota+", "+this.nombre+", "
			   +this.genero+ ", Edad: "+ calcularEdad()+"  --- Dueño: " 
			   +this.getDuenio().getNombre()+" \n";
			   
   }
   
      // por medio de este metodo enviamos el estado del todo el objeto
   @Override
   public String toString() {
	return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color
			+ ", genero=" + genero + ", nacio=" + nacio + ", murio=" + murio + ", duenio=" + duenio + "]";
   }

  
   public int compareTo(Mascota o) {
		
      switch(o.getCaso()) {
      	  case 1 :
      		         // para regresar todos los elementos del vector
      		     return 1;
      	  case 2 :   // para evaluar si el nombre del dueño es igual a otro
      		  		if (this.getDuenio().getNombre().equalsIgnoreCase(o.getDuenio().getNombre())) 
      		  			return 1;
      		  		else
      		  			return 0;
      	  case 3:
	      		        // para evaluar que el nombre de la mascota es igual a otro
				    if(this.getNombre().equalsIgnoreCase(o.getNombre()))
					   return 1;
				    else
				    	return 0;
			  
      	  case 4 :     // para evaluar que una fecha es igual a otra
	     		   if (this.getNacio().equals(o.getNacio())) 
	     			  return 1;
	     		   else
	     			  return 0;
		   
		  case 5:
			    if(this.getIdMascota() == o.getIdMascota())
			    	return 1;
			    else
			    	return 0;
			    
		  case 6:
			    if(this.getNacio().getYear() == o.getNacio().getYear())
			    	return 1;
			    else
			    	return 0;    
		 
		}
		  return Integer.MAX_VALUE;
	  }
   
  

	  
   
   
    
   
}
