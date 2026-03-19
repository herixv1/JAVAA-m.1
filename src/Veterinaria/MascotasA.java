package Veterinaria;

import java.time.LocalDate;
import java.util.Arrays;

public class MascotasA {
	         // declaracion del arreglo de objetos
	private Mascota mascotas[];
				// tope nos indica el ultimo valor que se almacena en el vector y representa la longitud logica del vector o arreglo
	private int tope;
	
			// en el constructor creamos el vector o arreglo y inicializamos tope a -1 que representa que esta vacio.
	public MascotasA(int tam) {
		this.mascotas = new Mascota[tam];
		this.tope=-1;
	}

	public Mascota[] getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota[] mascotas) {
		this.mascotas = mascotas;
	}

	public int getTope() {
		return tope;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

			// este metodo nos indica si esta vacio 
	public boolean vacio() {
		return this.tope == -1;
	}
	
		// este metodo nos indica si esta lleno
	public boolean lleno() {
		return this.tope == mascotas.length-1;
	}
	
	     // este metodo se encarga de almacenar en el vector un elemento nuevo
	public String add(Mascota nueva) {
	  String info="";	
		if (!lleno()) {
			this.tope++;
			nueva.setIdMascota(tope+1);
			this.mascotas[tope]=nueva;
			info= "Alta Exitosa";
		}
		else 
			info = "El Arreglo esta lleno";
	return info;
	}
	
	public String presentaUno( int pos) {
		return mascotas[pos].presentaMascota();
	}
	
	public Mascota regresaElemento(int pos ) {
		return mascotas[pos];
	}
	
	public String presentar(Mascota o) {
		String msj="";
		for(int i=0; i<=this.tope; i++ ) {
			if (mascotas[i].compareTo(o) == 1 )
				msj+= mascotas[i].presentaMascota()+"\n";	
		}
	return msj;
	}
	
	  // metodo para buscar por varios criterios (id, nombreMascota, nombre del dueño)
	  // llega un objeto de tipo mascota 
	  // aqui usamos compareTo que sobre escribimos en la clase Mascota
	public int buscar ( Mascota o) {
		for(int i=0; i<=tope; i++) {
			if(mascotas[i].compareTo(o) == 1 )
				return i;
		}
		return -1;
	}
	
	public Mascota buscarObjeto(Mascota o) {
		for(int i=0; i<=tope; i++) {
			if(mascotas[i].compareTo(o) == 1 )
				return this.mascotas[i];
		}
		return null;
	}
	
	public MascotasA buscarObjetoVector(Mascota o) {
		MascotasA encontradas = new MascotasA(this.tope);
		for(int i=0; i<=tope; i++) {
			if(mascotas[i].compareTo(o) == 1 )
				encontradas.add(mascotas[i]);
		}
		return encontradas;
	}
	
	
	public void recorrerFrente(int pos) {
		for(int i= pos; i< this.tope ; i++) {
			mascotas[i] = mascotas[i+1];
		}
		this.tope--;
	}
	
	public void orderar() {
		Mascota temp;
		for(int i=0; i< this.tope; i++) {
			for(int j= i; j<= this.tope; j++) {
			 if (mascotas[i].getNombre().compareToIgnoreCase(mascotas[j].getNombre()) > 0  ){
					temp = mascotas[i];
					mascotas[i]  = mascotas[j];
					mascotas[j]  = temp;
				}
					
			}
		}
	}
	
		
		public void orderarDueno() {
			Mascota temp;
			for(int i=0; i< this.tope; i++) {
				for(int j= i; j<= this.tope; j++) {
				 if (mascotas[i].getDuenio().getNombre().compareToIgnoreCase(mascotas[j].getDuenio().getNombre())
						      > 0  ){
						temp = mascotas[i];
						mascotas[i]  = mascotas[j];
						mascotas[j]  = temp;
					}
						
				}
			}	
		}	
		
			public void orderarEdad() {
				Mascota temp;
				for(int i=0; i< this.tope; i++) {
					for(int j= i; j<= this.tope; j++) {
					 if (mascotas[i].calcularEdad() > mascotas[j].calcularEdad()){
							temp = mascotas[i];
							mascotas[i]  = mascotas[j];
							mascotas[j]  = temp;
						}
							
					}
			}	
		
	}
	
	@Override
	public String toString() {
		return "MascotasA [mascotas=" + Arrays.toString(mascotas) + ", tope=" + tope + "]";
	}
	
}
