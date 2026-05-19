package Mcitas;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

import MVeterinaria.Mascota;

public class AdminCitas {

    public void menucitas() {
        int opc = 0;
        String msj = "Menu Citas\n";
        msj += "1. Agregar Cita\n";
        msj += "2. Eliminar Cita\n";
        msj += "3. Actualizar Cita\n";
        msj += "4. Ordenar Citas\n";
        msj += "5. Presentar Una Cita\n";
        msj += "6. Presentar Citas por Fecha\n";
        msj += "7. Presentar Citas Atendidas\n";
        msj += "8. Presentar Todas las Citas\n";
        msj += "9. Cerrar sesion";

        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(msj));
                switch (opc) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Opción: Agregar Cita");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Opción: Eliminar Cita");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Opción: Actualizar Cita");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Opción: Ordenar Citas");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Una Cita");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Citas por Fecha");
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Citas Atendidas");
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Todas las Citas");
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "¿Seguro que quiere cerrar sesion?");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido");
            }
        } while (opc != 9);
    }

}
