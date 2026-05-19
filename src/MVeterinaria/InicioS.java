package MVeterinaria;

import javax.swing.JOptionPane;
import Mcitas.AdminCitas;
import Mconsultas.MenuConsultas;

public class InicioS {
    public static void main(String[] args) {
        String[] roles = { "Administrador", "Veterinario", "Recepcionista", "salir" };
        int eleccion = 0;

        do {
            eleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione su rol de acceso al sistema:",
                    "Sistema Veterinario - Mr. Firulays",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    roles,
                    roles);

            switch (eleccion) {

                case 0: // Administrador
                    /* String contrasena = JOptionPane.showInputDialog(null,
                            "Ingrese la contrasena de Administrador:",
                            "Autenticacion",
                            JOptionPane.QUESTION_MESSAGE);

                    if (contrasena == null) {
                        JOptionPane.showMessageDialog(null, "Volviendo al menu ...");
                    } else if (contrasena.equals("POO2026")) { */
                        JOptionPane.showMessageDialog(null, "Bienvenido(a) Sr(a) Stark");
                        MenuMascotas appAdmin = new MenuMascotas();
                        appAdmin.menuMascotas();
                    /* } else {
                        JOptionPane.showMessageDialog(null,
                                "Contrasena incorrecta",
                                "Acceso denegado",
                                JOptionPane.ERROR_MESSAGE);
                    } */
                    break;

                case 1:
                    /* String contraseña1 = JOptionPane.showInputDialog(null,
                            "Ingrese la contrasena de Veterinario:",
                            "Autenticacion",
                            JOptionPane.QUESTION_MESSAGE);

                    if (contraseña1 == null) {
                        JOptionPane.showMessageDialog(null, "Volviendo al menu ...");
                    } else if (contraseña1.equals("VETPOO")) { */
                        JOptionPane.showMessageDialog(null, "Bienvenido(a) Dr(a) Dolittle");
                        MenuConsultas menuConsultas = new MenuConsultas();
                        menuConsultas.menuConsultas();
                    /* } else {
                        JOptionPane.showMessageDialog(null,
                                "Contrasena incorrecta",
                                "Acceso denegado",
                                JOptionPane.ERROR_MESSAGE);
                    } */
                    break;

                case 2:
                    /* String contrasena2 = JOptionPane.showInputDialog(null,
                            "Ingrese la contrasena de Recepcionista:",
                            "Autenticacion",
                            JOptionPane.QUESTION_MESSAGE);

                    if (contrasena2 == null) {
                        JOptionPane.showMessageDialog(null, "Volviendo al menu ...");
                    } else if (contrasena2.equals("RECEPPOO")) { */
                        JOptionPane.showMessageDialog(null, "Bienvenido(a) Recepcionista");
                        AdminCitas menuCitas = new AdminCitas();
                        menuCitas.menucitas();
                    /* } else {
                        JOptionPane.showMessageDialog(null,
                                "Contrasena incorrecta",
                                "Acceso denegado",
                                JOptionPane.ERROR_MESSAGE);
                    } */
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
