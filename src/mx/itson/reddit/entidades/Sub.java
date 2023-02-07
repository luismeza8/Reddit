/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lm
 */
public class Sub {
    private String nombre;
    private List<Usuario> usuarios = new ArrayList();
    private List<Publicacion> publicaciones = new ArrayList();
    
    public Sub(String nombre, List<Usuario> usuarios, List<Publicacion> publicaciones) {
        this.nombre = nombre;
        this.usuarios = usuarios;
        this.publicaciones = publicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    
}
