package com.example.practicalistas;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    int cod_preg;
    String preguntas;
    String preg_nivel;

    public int getCod_preg() {
        return cod_preg;
    }

    public void setCod_preg(int cod_preg) {
        this.cod_preg = cod_preg;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public String getPreg_nivel() {
        return preg_nivel;
    }

    public void setPreg_nivel(String preg_nivel) {
        this.preg_nivel = preg_nivel;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "cod_preg=" + cod_preg +
                ", preguntas='" + preguntas + '\'' +
                ", preg_nivel='" + preg_nivel + '\'' +
                '}';
    }
}
