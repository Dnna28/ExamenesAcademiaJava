package com.libros;

public class Libro {
    private int id;
    private String titulo;
    private int paginas;
    private Nacionalidad autorNacionalidad;

    public Libro(int id, String titulo, int paginas, Nacionalidad autorNacionalidad) {
        this.id = id;
        this.titulo = titulo;
        this.paginas = paginas;
        this.autorNacionalidad = autorNacionalidad;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public Nacionalidad getAutorNacionalidad() {
        return autorNacionalidad;
    }

    @Override
    public String toString() {
        return "Libro [id=" + id + ", titulo=" + titulo + ", paginas=" + paginas + ", autorNacionalidad=" + autorNacionalidad + "]";
    }
}
