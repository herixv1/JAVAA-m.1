package Veterinaria;
import javax.swing.JOptionPane;
import Mconsultas.MenuConsultas;

public class UsVet extends Usuario {
    
    public UsVet(String nombre) {
        super(nombre);
    }

    @Override
    public void iniciarMenu() {
        JOptionPane.showMessageDialog(null, "Bienvenido(a) Dr(a). " + nombre);
        
        // Se instancia y arranca únicamente el menú de consultas
        MenuConsultas menuConsultas = new MenuConsultas();
        menuConsultas.Menuconsultas();
    }
}
