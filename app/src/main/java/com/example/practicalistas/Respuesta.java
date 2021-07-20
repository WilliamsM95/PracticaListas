package com.example.practicalistas;

public class Respuesta {
    int id_resp;
    String respuesta;
    String descripcion;
    int id_pregunta;

    public int getId_resp() {
        return id_resp;
    }

    public void setId_resp(int id_resp) {
        this.id_resp = id_resp;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "id_resp=" + id_resp +
                ", respuesta='" + respuesta + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", id_pregunta=" + id_pregunta +
                '}';
    }
}
