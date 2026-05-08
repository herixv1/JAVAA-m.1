package MVeterinaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class MenuMascotas {

	VMascotasA mascotas = new VMascotasA(67);

	public LocalDate leerFechaNacimiento() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fecha = null;

		while (fecha == null) {
			String entrada = JOptionPane.showInputDialog("Ingresa la fecha con formato (dd-MM-yyyy)");
			try {
				fecha = LocalDate.parse(entrada, formato);
				if (fecha.isAfter(LocalDate.now())) {
					System.out.println("Error: la fecha no puede ser futura.");
					fecha = null;
				}

			} catch (DateTimeParseException e) {
				System.out.println("Formato inválido. Intenta nuevamente.");
			}
		}
		return fecha;
	}

	// metodo para ller los datos de la mascota
	public Mascota leerDatosM() {
		Mascota nueva = new Mascota();
		// crear el dueño usando el constructor que recibe el nombre (evita uso de
		// constructor por defecto)
		nueva.setNombre(JOptionPane.showInputDialog("Nombre: "));
		nueva.setRaza(JOptionPane.showInputDialog("Raza: "));
		nueva.setNacio(leerFechaNacimiento());
		// leemos el nombre del dueño y creamos el objeto Dueno con dicho nombre
		Dueno duenio = new Dueno(JOptionPane.showInputDialog("Nombre del Dueño "));
		// asignamos el dueno a la mascota
		nueva.setDuenio(duenio);
		return nueva;
	}

	public void menuMascotas() {
		int opc = 0;
		int pos = -1;
		Mascota o = new Mascota();
		String msj = "Veterinaria firulays\n ";
		msj += "1  - Agregar un nueva Mascota\n";
		msj += "2  - Presentar todas las mascotas\n";
		msj += "3  - Presentar las mascotas de un dueño\n";
		msj += "4  - Presentar las mascotas de que nacieron la misma fecha\n";
		msj += "5  - Presentar las mascotas de que nacieron el mismo año\n";
		msj += "6  - Buscar Mascota por ID regresando la posiscion\n";
		msj += "7  - Buscar Mascota por Nombre regresando la posiscion\n";
		msj += "8  - Buscar Mascota por ID regresando un Objeto\n";
		msj += "9  - Buscar Mascota por Nombre regreso Objeto\n";
		msj += "10 - Presenta todas las Mascotas con el mismo nombre y regresa un vector  \n";
		msj += "11 - Presenta las Mascota por Dueño y regresa un vector \n";
		msj += "12 - Eliminar una Mascota por ID \n";
		msj += "13 - Modificar los datos de la mascota \n";
		msj += "14 - Ordenar el vector de Mascotas \n";
		msj += "15 - Ordenar el vector de Mascotas por el nombre del dueño \n";
		msj += "16 - Ordenar el vector por nombre de Mascotas Desendentemente \n";
		msj += "17 - Ordenar el vector por edad de la Masotas \n";

		msj += "18 - cerrar sesion";

		do {
			try {
				opc = Integer.parseInt(JOptionPane.showInputDialog(msj));
				switch (opc) {
					case 1:
						mascotas.add(leerDatosM());
						break;
					case 2: // con el metodo generico
						o.setCaso(1);
						JOptionPane.showMessageDialog(null, mascotas.presentar(o));
						break;

					case 3:
						String amo = JOptionPane.showInputDialog("Nombre del Dueño de la Mascota");
						// invocando el metodo generico para presentar de diferentes criterios
						o.setCaso(2);
						// asegurarnos de tener un objeto Dueno con el nombre buscado
						o.setDuenio(new Dueno(amo));
						JOptionPane.showMessageDialog(null, mascotas.presentar(o));
						break;

					case 4:
						LocalDate fecha = leerFechaNacimiento();
						// invocando el metodo generico para presentar de diferentes criterios
						o.setCaso(4);
						o.setNacio(fecha);
						JOptionPane.showMessageDialog(null, mascotas.presentar(o));
						break;

					case 5:
						// presentar las mascotas que nacieron el mismo año
						LocalDate fechaNac = leerFechaNacimiento();
						// invocando el metodo generico para presentar de diferentes criterios
						o.setCaso(6);
						o.setNacio(fechaNac);
						JOptionPane.showMessageDialog(null, mascotas.presentar(o));
						break;

					case 6: // buscar mascota por ID
						pos += -1;
						o.setCaso(5);
						o.setIdMascota(Integer.parseInt(JOptionPane.showInputDialog("Id de Mascota a Buscar")));
						pos = mascotas.buscar(o);
						if (pos != -1) {
							JOptionPane.showMessageDialog(null, mascotas.presentaUno(pos));

						} else
							JOptionPane.showMessageDialog(null, "No tengo una mascota con ese ID");
						break;

					case 7: // buscar mascota por nombre
						pos = -1;
						o.setCaso(3);
						o.setNombre(JOptionPane.showInputDialog("Nombre de la Mascota a Buscar"));
						// buscamos utilizando el metodo generico
						pos = mascotas.buscar(o);
						if (pos != -1)
							JOptionPane.showMessageDialog(null, mascotas.presentaUno(pos));
						else
							JOptionPane.showMessageDialog(null, "No tengo una mascota con ese nombre");
						break;

					case 8: // Buscar Mascota por ID regresando un Objeto
						o.setCaso(5);
						o.setIdMascota(Integer.parseInt(JOptionPane.showInputDialog("Id de Mascota a Buscar")));
						o = mascotas.buscarObjeto(o);
						if (pos != -1) {
							JOptionPane.showMessageDialog(null, o.presentaMascota());

						} else
							JOptionPane.showMessageDialog(null, "No tengo una mascota con ese ID");
						break;
					case 9: // Buscar Mascota por Nombre de la mascota y regresando un Objeto
						o.setCaso(3);
						o.setNombre(JOptionPane.showInputDialog("Nombre de la Mascota a Buscar"));
						o = mascotas.buscarObjeto(o);
						if (pos != -1) {
							JOptionPane.showMessageDialog(null, o.presentaMascota());

						} else
							JOptionPane.showMessageDialog(null, "No tengo una mascota con ese Nombre");
						break;
					case 10: // Presenta todas las Mascotas con el mismo nombre y regresa un vector
						VMascotasA encontradas = new VMascotasA(mascotas.getTope());
						o.setCaso(3);
						o.setNombre(JOptionPane.showInputDialog("Nombre de la Mascota a Buscar"));
						encontradas = mascotas.buscarObjetoVector(o);

						if (!encontradas.vacio()) {
							o.setCaso(1);
							JOptionPane.showMessageDialog(null, encontradas.presentar(o));

						} else
							JOptionPane.showMessageDialog(null, "No tengo mascotas con ese Nombre");
						break;
					case 11: // Presenta las Mascota por Dueño y regresa un vector
						VMascotasA encontradas2 = new VMascotasA(mascotas.getTope());
						o.setCaso(2);
						o.setDuenio(new Dueno(JOptionPane.showInputDialog("Nombre del Dueño a Buscar")));
						encontradas2 = mascotas.buscarObjetoVector(o);
						if (!encontradas2.vacio()) {
							o.setCaso(1);
							JOptionPane.showMessageDialog(null, encontradas2.presentar(o));

						} else
							JOptionPane.showMessageDialog(null, "No tengo mascotas con ese Nombre");
						break;

					case 12:
						int eliminarID = Integer.parseInt(JOptionPane.showInputDialog("Id de Mascota a eliminar"));
						o.setCaso(5);
						o.setIdMascota(eliminarID);
						int posE = mascotas.buscar(o);
						if (posE != -1) {
							JOptionPane.showMessageDialog(null, "Datos de la Mascota que quieres eliminar"
									+ mascotas.presentaUno(posE));
							mascotas.recorrerFrente(posE);

						} else
							JOptionPane.showMessageDialog(null, "No tengo una mascota con ese ID");
						break;
					case 13: // modificar los datos de una mascota

						int idMod = Integer
								.parseInt(JOptionPane.showInputDialog("Ingresa el ID de la Mascota a modificar:"));
						o.setCaso(5);
						o.setIdMascota(idMod);
						int posMod = mascotas.buscar(o);

						if (posMod != -1) {
							// Obtenemos la mascota existente
							Mascota mascotaMod = mascotas.regresaElemento(posMod);
							JOptionPane.showMessageDialog(null, "Datos actuales:\n" + mascotaMod.presentaMascota());

							// Pedimos los nuevos datos, mostrando los actuales como texto por defecto
							String nuevoNombre = JOptionPane.showInputDialog("Nuevo Nombre de la mascota:",
									mascotaMod.getNombre());
							String nuevaRaza = JOptionPane.showInputDialog("Nueva Raza:", mascotaMod.getRaza());
							String nuevoDueno = JOptionPane.showInputDialog("Nuevo Nombre del Dueño:",
									mascotaMod.getDuenio().getNombre());

							// Actualizamos los datos
							if (nuevoNombre != null && !nuevoNombre.isEmpty())
								mascotaMod.setNombre(nuevoNombre);
							if (nuevaRaza != null && !nuevaRaza.isEmpty())
								mascotaMod.setRaza(nuevaRaza);
							if (nuevoDueno != null && !nuevoDueno.isEmpty())
								mascotaMod.getDuenio().setNombre(nuevoDueno);

							JOptionPane.showMessageDialog(null, "Datos modificados correctamente.");
						} else {
							JOptionPane.showMessageDialog(null, "No se encontró ninguna mascota con ese ID.");
						}
						break;

					case 14: // Ordenar el vector de Mascotas
						mascotas.ordenar();
						o.setCaso(1);
						JOptionPane.showMessageDialog(null, mascotas.presentar(o));
						break;

					// modificar el codigo para que usen un solo metodo para ordenar por cualquier
					// criterio

					case 15: // Ordenar el vector de Mascotas por el nombre del dueño
						mascotas.ordenarDueno();
						o.setCaso(1);
						JOptionPane.showMessageDialog(null, mascotas.presentar(o));
						break;

					case 16: // Ordenar el vector por nombre de Mascotas Desendentemente
						mascotas.ordenarDescendente();
						o.setCaso(1);
						JOptionPane.showMessageDialog(null,
								"Mascotas ordenadas descendentemente:\n" + mascotas.presentar(o));
						break;
					case 17: // Ordenar el vector por edad de la Masotas
						mascotas.ordenarEdad();
						o.setCaso(1);
						JOptionPane.showMessageDialog(null, mascotas.presentar(o));
						break;
					case 18:
						JOptionPane.showMessageDialog(null, "¿Seguro que quiere cerrar sesion?");
						break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
			} // 1x©
		} while (opc != 18);
	}
}