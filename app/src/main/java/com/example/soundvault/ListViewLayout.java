package com.example.soundvault;

import java.io.Serializable;

public class ListViewLayout implements Serializable {

    private int imagen;
    private String album;
    private String autor;
    private String descripcion;
    private String tracklist;

    public ListViewLayout(int imagen, String album, String autor, String descripcion, String tracklist) {
        this.imagen = imagen;
        this.album = album;
        this.autor = autor;
        this.descripcion = descripcion;
        this.tracklist = tracklist;
    }

    public int getImagen() {
        return imagen;
    }

    public String getAlbum() {
        return album;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTracklist() {
        return tracklist;
    }
}
