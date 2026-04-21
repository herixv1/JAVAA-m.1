package Veterinaria;
import javax.swing.JOptionPane;

public class UsAdmin extends Usuario {
    
    public UsAdmin(String nombre) {
        super(nombre);
    }

    @Override
    public void iniciarMenu() {

       JOptionPane.showMessageDialog(null, "Bienvenido(a) Administrador: " + nombre);
        AppVeterinaria appAdmin = new AppVeterinaria();
        appAdmin.menu();

    }
}
