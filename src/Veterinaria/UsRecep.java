package Veterinaria;
import javax.swing.JOptionPane;
import Mcitas.Appcitas;
// import Mcitas.Appcitas; // Descomenta esto dependiendo de cómo se llame tu clase principal de citas

public class UsRecep extends Usuario {
    
    public UsRecep(String nombre) {
        super(nombre);
    }

    @Override
    public void iniciarMenu() {
        JOptionPane.showMessageDialog(null, "Bienvenido(a) Recepcionista: " + nombre);

        // Llama al método para mostrar el menú de citas
        // Se instancia y arranca únicamente el menú de citas
        Appcitas menuCitas = new Appcitas();
        menuCitas.menucitas(); // Ajusta este método según lo que tengas en tu paquete Mcitas
    }
}