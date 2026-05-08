package MVeterinaria;
import javax.swing.JOptionPane;
import Mcitas.AdminCitas; 
import Mconsultas.MenuConsultas; 

public class InicioS {
    public static void main(String[] args) {
        String[] roles = {"Administrador", "Veterinario", "Recepcionista"};
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
                    JOptionPane.showMessageDialog(null, "Bienvenido(a) Sr(a) stark");
                    MenuMascotas appAdmin = new MenuMascotas();
                    appAdmin.menuMascotas();
                    break;
                    
                case 1: // Veterinario
                    JOptionPane.showMessageDialog(null, "Bienvenido(a) Dr(a) dolittle");
                    MenuConsultas menuConsultas = new MenuConsultas();
                    menuConsultas.menuConsultas(); 
                    break;
                    
                case 2: // Recepcionista
                    JOptionPane.showMessageDialog(null, "Bienvenido(a) Recepcionista");
                    AdminCitas menuCitas = new AdminCitas();
                    menuCitas.menucitas(); 
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    System.exit(0); 
            }
        } while (true);
    }
}
