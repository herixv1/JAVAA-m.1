package HerenciaMultimedia;

public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        if (actorPrincipal == null && actrizPrincipal == null) {
            System.out.println("error: el actor principal y la actriz principal no pueden ser ambos nulos. se asigna valor por defecto al actor.");
            actorPrincipal = "desconocido";
        }
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public String toString() {
        return super.toString() + " | actor: " + (actorPrincipal != null ? actorPrincipal : "n/a") + " | actriz: " + (actrizPrincipal != null ? actrizPrincipal : "n/a");
    }
}