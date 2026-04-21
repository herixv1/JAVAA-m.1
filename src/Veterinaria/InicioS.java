package Veterinaria;
import javax.swing.JOptionPane;

public class InicioS {

    // Método Genérico: Ejecuta el menú sin importar qué tipo de usuario sea
    public static <T extends Usuario> void ejecutarMenuRol(T usuarioActual) {
        usuarioActual.iniciarMenu(); 
    }

    public static void main(String[] args) {
        String[] roles = {"Administrador", "Veterinario", "Recepcionista"};
        
        int eleccion = JOptionPane.showOptionDialog(null, 
                "Seleccione su rol de acceso al sistema:", 
                "Sistema Veterinario - Mr. Firulays", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                roles, 
                roles);

        Usuario usuarioLogueado = null;

        switch (eleccion) {
            case 0: // Administrador
                usuarioLogueado = new UsAdmin("Admin Principal");
                break;
            case 1: // Veterinario
                usuarioLogueado = new UsVet("Veterinario en Turno");
                break;
            case 2: // Recepcionista
                usuarioLogueado = new UsRecep("Recepcionista en Turno");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                System.exit(0);
        }

        // Si se logueó correctamente, se invoca el método genérico
        if (usuarioLogueado != null) {
            ejecutarMenuRol(usuarioLogueado);
        }
    }
}