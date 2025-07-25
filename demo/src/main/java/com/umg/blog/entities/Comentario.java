package com.umg.blog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Comentario {
    @Id
    private Long id_comentario;

    private String contenido_comentario;
    private LocalDateTime fecha_comentario;
    private Long id_usuario;
    private Long id_post;
    
    public Comentario() {
    }

    public Comentario(Long id_comentario, String contenido_comentario, LocalDateTime fecha_comentario, Long id_usuario, Long id_post) {
        this.id_comentario = id_comentario;
        this.contenido_comentario = contenido_comentario;
        this.fecha_comentario = fecha_comentario;
        this.id_usuario = id_usuario;
        this.id_post = id_post;
    }

    public Long getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Long id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getContenido_comentario() {
        return contenido_comentario;
    }

    public void setContenido_comentario(String contenido_comentario) {
        this.contenido_comentario = contenido_comentario;
    }

    public LocalDateTime getFecha_comentario() {
        return fecha_comentario;
    }

    public void setFecha_comentario(LocalDateTime fecha_comentario) {
        this.fecha_comentario = fecha_comentario;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_post() {
        return id_post;
    }

    public void setId_post(Long id_post) {
        this.id_post = id_post;
    }
    
}
