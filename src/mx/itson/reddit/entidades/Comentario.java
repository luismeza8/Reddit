/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.entidades;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author lm
 */
public class Comentario {
    private Usuario usuario;
    private LocalTime fecha;
    private int calificacion;

    private String cuerpo;
    
    public Comentario(Usuario usuario, LocalTime fecha, int calificacion, String cuerpo) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.cuerpo = cuerpo;
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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
}
