/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
  Realiza de nuevo el ejercicio de la colección de discos pero
 *    utilizando esta vez una lista para almacenar la información
 *    sobre los discos en lugar de un array convencional. Comprobarás
 *    que el código se simplifica notablemente ¿Cuánto ocupa el programa
 *    original hecho con un array? ¿Cuánto ocupa este nuevo programa
 *    hecho con una lista?
 */
public class Disco {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;

    public Disco(String codigo, String autor, String titulo, String genero) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Disco{" + "codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + '}';
    }
    
    
}
