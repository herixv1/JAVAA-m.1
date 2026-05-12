package Excepciones;

public class APePe {

 public static void main(String[] args) {

        Curso curso = new Curso("POO/A","Programación Orientada a Objetos", 10);

        Estudiantes e1 = new Estudiantes( "A001","Juan",90);

        Estudiantes e2 = new Estudiantes( "A002",
                        "Ana",
                        60
                );

        Estudiantes e3 =
                new Estudiantes(
                        "",
                        "Luis",
                        85
                );

        Estudiantes e4 =
                new Estudiantes(
                        "A004",
                        "",
                        95
                );

        Estudiantes e5 =
                new Estudiantes(
                        "A005",
                        "Carlos",
                        100
                );

        // ==========================================
        // MANEJO DE EXCEPCIONES
        // ==========================================

        try {

            curso.inscribir(e1);

        } catch (InscripcionException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }

        try {

            curso.inscribir(e2);

        } catch (InscripcionException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }

        try {

            curso.inscribir(e3);

        } catch (InscripcionException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }

        try {

            curso.inscribir(e4);

        } catch (InscripcionException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }

        try {

            curso.inscribir(e5);

        } catch (InscripcionException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }

        // ==========================================
        // MOSTRAR INSCRITOS
        // ==========================================

        curso.mostrarInscritos();
    }
}
