package com.example.practicalistas;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    int id_pregunta;
    int id_juego;
    String pregunta;
    int tipo;
    int leccion;

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getLeccion() {
        return leccion;
    }

    public void setLeccion(int leccion) {
        this.leccion = leccion;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "id_pregunta=" + id_pregunta +
                ", id_juego=" + id_juego +
                ", pregunta='" + pregunta + '\'' +
                ", tipo=" + tipo +
                ", leccion=" + leccion +
                '}';
    }
}
