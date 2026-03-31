package HerenciaMultimedia;

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private double duracion;

    public Multimedia(String titulo, String autor, Formato formato, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public boolean equals(Multimedia m) {
        return this.titulo.equals(m.titulo) && this.autor.equals(m.autor);
    }

    public String toString() {
        return "titulo: " + titulo + " | autor: " + autor + " | formato: " + formato + " | duracion: " + duracion + " min";
    }
}