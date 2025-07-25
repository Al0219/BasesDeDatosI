package com.umg.blog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Publicacion {
    @Id
    private Long id_post;

    private String titulo_post;
    private String contenido_post;
    private LocalDateTime fecha_publicacion_post;
    private Long id_usuario;

    public Publicacion() {
    }

    public Publicacion(Long id_post, String titulo_post, String contenido_post, LocalDateTime fecha_publicacion_post, Long id_usuario) {
        this.id_post = id_post;
        this.titulo_post = titulo_post;
        this.contenido_post = contenido_post;
        this.fecha_publicacion_post = fecha_publicacion_post;
        this.id_usuario = id_usuario;
    }

    public Long getId_post() {
        return id_post;
    }

    public void setId_post(Long id_post) {
        this.id_post = id_post;
    }

    public String getTitulo_post() {
        return titulo_post;
    }

    public void setTitulo_post(String titulo_post) {
        this.titulo_post = titulo_post;
    }

    public String getContenido_post() {
        return contenido_post;
    }

    public void setContenido_post(String contenido_post) {
        this.contenido_post = contenido_post;
    }

    public LocalDateTime getFecha_publicacion_post() {
        return fecha_publicacion_post;
    }

    public void setFecha_publicacion_post(LocalDateTime fecha_publicacion_post) {
        this.fecha_publicacion_post = fecha_publicacion_post;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

}
