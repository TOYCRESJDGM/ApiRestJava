package org.apirest.model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class book {
    private int id;
    private String titulo;
    private String descripccion;
    private String autor;

    public book() {
    }
   
    public book(int id, String titulo, String descripccion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.descripccion = descripccion;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
