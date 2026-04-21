package Veterinaria;	
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;
public class AppVeterinaria {
	            // declaracion del objeto para manejar el vector de mascotas
	private MascotasA mascotas ;
	
				// instacia de la clase MascotasA aqui estamos creando el objeto que maneja el vector de mascotas
	public AppVeterinaria () {
		mascotas = new MascotasA(50);
	}
	
	//public static void main(String[] args) {
	//	AppVeterinaria obj = new AppVeterinaria();
	//	obj.menu();
	//}
	
		// metodo para leer un String que representa la fecha y lo comvierte a un tipo de  dato LocalDate
	public  LocalDate leerFechaNacimiento() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha = null;

        while (fecha == null) {
              String entrada = JOptionPane.showInputDialog("Ingresa la fecha con formato (dd-MM-yyyy)") ;
            try {
                 fecha = LocalDate.parse(entrada, formato);
                if (fecha.isAfter(LocalDate.now())) {
                    System.out.println("Error: la fecha no puede ser futura.");
                    fecha = null;
                }

            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Intenta nuevamente.");}
        }
		return fecha;
     }
	
	
	   // metodo para ller los datos de la mascota 
	public Mascota leerDatosM () {
		Mascota nueva = new Mascota();
		Dueno duenio = new Dueno();
		nueva.setNombre(JOptionPane.showInputDialog("Nombre: "));
		nueva.setRaza(JOptionPane.showInputDialog("Raza: "));
		nueva.setNacio(leerFechaNacimiento());
				// leemosel nombre del dueño y lo asignamos al variable de instancia del objeto 
		duenio.setNombre(JOptionPane.showInputDialog("Nombre del Dueño "));
				// asignamos el dueno a la mascota
		nueva.setDuenio(duenio);
	return nueva;
	}
	 
	public void inicializarVector() {
		 mascotas.add(new Mascota(1,"Cuco","Perico", LocalDate.parse("2023-05-17"),new Dueno("Marisela")));
		 mascotas.add(new Mascota(2,"Ary","Chihuahua",LocalDate.parse("2024-04-13"),new Dueno("Pedro")));
		 mascotas.add(new Mascota(3,"Kelly","Hasky",LocalDate.parse("2021-05-01"),new Dueno("Marisela")));
		 mascotas.add(new Mascota(4,"Rocky","Pastor",LocalDate.parse("2025-01-13"),new Dueno("Luis")));
		 mascotas.add(new Mascota(4,"Kelly","Bulldog",LocalDate.parse("2026-02-13"),new Dueno("Carlos")));
	 }
	
	public void menu() {
		inicializarVector();
		int opc=0;
		int pos = -1;
		Mascota o = new Mascota();
		String msj="Veterinaria La Mascota Feliz\n ";
		msj+= "1  ......... Agregar un nueva Mascota\n";
		msj+= "2  ......... Presentar todas las mascotas\n";
		msj+= "3  ......... Presentar las mascotas de un dueño\n";
		msj+= "4  ......... Presentar las mascotas de que nacieron la misma fecha\n";
		msj+= "5  ......... Presentar las mascotas de que nacieron el mismo año\n";
		msj+= "6  ......... Buscar Mascota por ID regresando la posiscion\n";
		msj+= "7  ......... Buscar Mascota por Nombre regresando la posiscion\n";
		msj+= "8  ......... Buscar Mascota por ID regresando un Objeto\n";
		msj+= "9  ......... Buscar Mascota por Nombre regreso Objeto\n";
		msj+=" 10 ......... Presenta todas las Mascotas con el mismo nombre y regresa un vector  \n";
		msj+= "11 ......... Presenta las Mascota por Dueño y regresa un vector \n";
		msj+= "12 ......... Eliminar una Mascota por ID \n";
		msj+= "13 ......... Modificar los datos de la mascota \n";
		msj+= "14 ......... Ordenar el vector de Mascotas \n";
		msj+= "15 ......... Ordenar el vector de Mascotas por el nombre del dueño \n";
		msj+= "16 ......... Ordenar el vector por nombre de Mascotas Desendentemente \n";
		msj+= "17 ......... Ordenar el vector por edad de la Masotas \n";
		
		
		msj+= "18 ......... Salir";
		do {
		  opc = Integer.parseInt(JOptionPane.showInputDialog(msj));
		  switch(opc){
		  	case  1: 
		  		   mascotas.add(leerDatosM ());
		  		   break;
		  	
		  	case  2:
		  		 		   // con el metodo generico 
		  		o.setCaso(1);
		  		JOptionPane.showMessageDialog(null,mascotas.presentar(o));
		  		break;
		  	
		  	case  3:
		  		String amo = JOptionPane.showInputDialog("Nombre del Dueño de la Mascota");
		  	 				// invocando el metodo generico para presentar de diferentes criterios
		  		o.setCaso(2);
		  		o.getDuenio().setNombre(amo);
		  		JOptionPane.showMessageDialog(null,mascotas.presentar(o));
		  		break;
		  		
		  	case  4:
  				LocalDate fecha = leerFechaNacimiento();
		  				// invocando el metodo generico para presentar de diferentes criterios
  		       	o.setCaso(4);
  	          	o.setNacio(fecha);
  	          	JOptionPane.showMessageDialog(null,mascotas.presentar(o));
  	          	break;
  		
		  	case  5:
		  			//  presentar las mascotas que nacieron el mismo año
		  		LocalDate fechaNac = leerFechaNacimiento();
		  			// invocando el metodo generico para presentar de diferentes criterios
  		       	o.setCaso(6);
  	          	o.setNacio(fechaNac);
  	          	JOptionPane.showMessageDialog(null,mascotas.presentar(o));
  	          	break;
  						
		  	case 6:  // buscar mascota por ID
		  		   pos += -1;
		  		   o.setCaso(5);
		  		   o.setIdMascota( Integer.parseInt(JOptionPane.showInputDialog("Id de Mascota a Buscar")));
		  		   pos = mascotas.buscar(o);
		  		       if( pos != -1) {
		  		    	 JOptionPane.showMessageDialog(null,mascotas.presentaUno(pos));
		  		        		       
		  		       } else
		  		    	 JOptionPane.showMessageDialog(null,"No tengo una mascota con ese ID");
		  		   break;
		  	
		  	case 7:  	// buscar mascota por nombre
		  		   pos = -1;
		  		   o.setCaso(3);
                   o.setNombre(JOptionPane.showInputDialog("Nombre de la Mascota a Buscar"));
		  		         // buscamos utilizando el metodo generico
                   pos = mascotas.buscar(o);
		  		    if( pos != -1)
		  		    	 JOptionPane.showMessageDialog(null,mascotas.presentaUno(pos));
		  		    else
		  		    	 JOptionPane.showMessageDialog(null,"No tengo una mascota con ese nombre"); 
		  		   break;
		  		  
		  	case 8: 	//Buscar Mascota por ID regresando un Objeto
		  		   o.setCaso(5);
		  		   o.setIdMascota( Integer.parseInt(JOptionPane.showInputDialog("Id de Mascota a Buscar")));
		  		   o = mascotas.buscarObjeto(o);
		  		       if( pos != -1) {
		  		    	 JOptionPane.showMessageDialog(null,o.presentaMascota());
		  		        		       
		  		       } else
		  		    	 JOptionPane.showMessageDialog(null,"No tengo una mascota con ese ID"); 
		  		   break;
		  	case 9: 	//Buscar Mascota por Nombre de la mascota y regresando un Objeto
		  		   o.setCaso(3);
		  		   o.setNombre(JOptionPane.showInputDialog("Nombre de la Mascota a Buscar"));
		  		   o = mascotas.buscarObjeto(o);
		  		       if( pos != -1) {
		  		    	 JOptionPane.showMessageDialog(null,o.presentaMascota());
		  		        		       
		  		       } else
		  		    	 JOptionPane.showMessageDialog(null,"No tengo una mascota con ese Nombre"); 
		  		   break;	
			case 10: 	 // Presenta todas las Mascotas con el mismo nombre y regresa un vector
		  		   MascotasA encontradas = new MascotasA(mascotas.getTope());
				   o.setCaso(3);
		  		   o.setNombre(JOptionPane.showInputDialog("Nombre de la Mascota a Buscar"));
		  		   encontradas = mascotas.buscarObjetoVector(o);
		  		   
		  		       if( !encontradas.vacio() ) {
		  		    	 o.setCaso(1);   
		  		    	 JOptionPane.showMessageDialog(null,encontradas.presentar(o));
		  		        		       
		  		       } else
		  		    	 JOptionPane.showMessageDialog(null,"No tengo mascotas con ese Nombre"); 
		  		   break;
			case 11: 	 // Presenta las Mascota por Dueño y regresa un vector
		  		   MascotasA encontradas2 = new MascotasA(mascotas.getTope());
				   o.setCaso(2);
				   o.getDuenio().setNombre(JOptionPane.showInputDialog("Nombre del Dueño a Buscar"));
		  		   encontradas2 = mascotas.buscarObjetoVector(o);
		  		       if( !encontradas2.vacio() ) {
		  		    	 o.setCaso(1);   
		  		    	 JOptionPane.showMessageDialog(null,encontradas2.presentar(o));
		  		        		       
		  		       } else
		  		    	 JOptionPane.showMessageDialog(null,"No tengo mascotas con ese Nombre"); 
		  		   break;	
		  		  
		  	case 12:
		  		   int eliminarID = Integer.parseInt(JOptionPane.showInputDialog("Id de Mascta a a eliminar"));
		  		   o.setCaso(5);
		  		   o.setIdMascota(eliminarID);
		  		   int posE = mascotas.buscar(o);
		  		       if (posE != -1) {
		  		    	 JOptionPane.showMessageDialog(null, "Datos de la Mascota que quieres eliminar"
		  		                 + mascotas.presentaUno(posE));
		  		    	 mascotas.recorrerFrente(posE);
		  		    	 
		  		       }else
		  		    	 JOptionPane.showMessageDialog(null,"No tengo una mascota con ese ID");
		  		   break;
		  	case 13: // modificar los datos de una mascota
		  				
		  		    // realiza lo que va aqui
		  		    break;
		  		  	
		  	case 14: // Ordenar el vector de Mascotas
		  		mascotas.orderar();
		  		o.setCaso(1);
		  		JOptionPane.showMessageDialog(null,mascotas.presentar(o));
		  		break;
		  	
		  	// modificar el codigo para que usen un solo metodo para ordenar por cualquier criterio
		  	
		  	case 15: // Ordenar el vector de Mascotas por el nombre del dueño
		  		mascotas.orderarDueno();
		  		o.setCaso(1);
		  		JOptionPane.showMessageDialog(null,mascotas.presentar(o));
		  		break;
		  	
		  	 case 16: //Ordenar el vector por nombre de Mascotas Desendentemente
		  		 break;
		  	 case 17: //Ordenar el vector por edad de la Masotas
		  		mascotas.orderarEdad(); 
		  		o.setCaso(1);
		  		JOptionPane.showMessageDialog(null,mascotas.presentar(o));
		  		break;
		  	 case 18:	
		  	 		JOptionPane.showMessageDialog(null,"Bonito Dia, hasta pronto");
		  }
		}while(opc!=18);
	}

}
