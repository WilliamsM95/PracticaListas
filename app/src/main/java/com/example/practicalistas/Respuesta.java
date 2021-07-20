package com.example.practicalistas;

public class Respuesta {
    int cod_resp;
    int cod_preg;
    String respuestas;
    int valid;

    public int getCod_resp() {
        return cod_resp;
    }

    public void setCod_resp(int cod_resp) {
        this.cod_resp = cod_resp;
    }

    public int getCod_preg() {
        return cod_preg;
    }

    public void setCod_preg(int cod_preg) {
        this.cod_preg = cod_preg;
    }

    public String getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "cod_resp=" + cod_resp +
                ", cod_preg=" + cod_preg +
                ", respuestas='" + respuestas + '\'' +
                ", valid=" + valid +
                '}';
    }
}
