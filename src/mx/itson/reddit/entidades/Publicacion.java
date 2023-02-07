/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.entidades;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lm
 */
public class Publicacion {
    private Usuario usuario;
    private LocalTime fecha;
    private String titulo;
    private String cuerpo;
    private List<Comentario> comentarios;
    private int calificacion;
    
    public Publicacion(Usuario usuario, LocalTime fecha, String titulo, String cuerpo, List<Comentario> comentarios, int calificacion) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.comentarios = comentarios;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
        
}
