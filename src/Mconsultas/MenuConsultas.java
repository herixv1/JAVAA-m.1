package Mconsultas;

import javax.swing.JOptionPane;

public class MenuConsultas {

    public void menuConsultas() {
        int opc = 0;
        String msj = "Menu Consultas\n";
        msj += "1. Agregar Consulta\n";
        msj += "2. Eliminar Consulta\n";
        msj += "3. Actualizar Consulta\n";
        msj += "4. Ordenar Consultas\n";
        msj += "5. Presentar Consulta\n";
        msj += "6. Presentar Consultas por Fecha\n";
        msj += "7. Presentar Consultas Atendidas\n";
        msj += "8. Presentar Todas las Consultas\n";
        msj += "9. Presentar Consultas por Mascota\n";
        msj += "10. Presentar Consultas por Veterinario\n";
        msj += "11. Cerrar sesion";

        do {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(msj));
                switch (opc) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Opción: Agregar Consulta");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Opción: Eliminar Consulta");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Opción: Actualizar Consulta");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Opción: Ordenar Consultas");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Consulta");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Consultas por Fecha");
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Consultas Atendidas");
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Todas las Consultas");
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Consultas por Mascota");
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, "Opción: Presentar Consultas por Veterinario");
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null, "¿Seguro que quiere cerrar sesion?");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido");
            }
        } while (opc != 11);
    }

    public Consulta leerDatos() {
        return null;
    }

}
