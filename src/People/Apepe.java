package People;

import VectorG.Vector;


public class Apepe {
    public static void main(String[] args) {
        
        Vector<Persona> datos = new Vector<>(20);

        datos.add(new Rventas("CHOUNA", "JRT067","Nocturno", 1, 10));
        datos.add(new Rventas("YELO", "KYLR061","Matutino", 2, 120));
        
        Rventas empleado1 = new Rventas("Git", "GHC777","24/7", 3, 15);
        datos.add(empleado1);

        /*System.out.println("Busqueda por RFC");
        System.out.println(datos.presentar(empleado1, Comparadores.PorRFC));

        System.out.println("Busqueda por nombre");
        System.out.println(datos.presentar(empleado1, Comparadores.PorNombre));*/

        Empleado buscar = new Empleado();
        buscar.setNombre("simeone");

        buscar=(Empleado) datos.buscar(buscar, Comparadores.PorNombre);
        
        
        if(buscar instanceof Mantenimiento){
            buscar=(Mantenimiento) buscar;
        }
        else 
            buscar=(Rventas) buscar;



        if (buscar != null) {
            System.out.println(buscar.toString()); 
        }
         else {
            System.out.println("No se encontró");
        }

    }

}
