package co.uniquindio.java;

public class Libro {
    private String titulo;
    private String categoria;
    private String autor;
    
    public Libro(String titulo, String categoria, String autor) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", categoria=" + categoria + ", autor=" + autor + "]";
    }

}
