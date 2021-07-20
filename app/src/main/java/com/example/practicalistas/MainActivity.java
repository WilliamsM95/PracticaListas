package com.example.practicalistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pregunta> preguntasList = new ArrayList<>();
    Pregunta pregunta;

    List<Respuesta> respuestaList = new ArrayList<>();
    Respuesta respuesta;

    TextView tituloPregunta;

    int pregunta_seleccionada = 2;
    int index = pregunta_seleccionada - 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InicializarControles();
        this.LlenarListaPreguntas(); //equivale a los metodos response que llenarian nuestras lista con la data de la BD
        this.LlenarListaRespuestas();


//        System.out.println("El tamaño de la lista de preguntas es: " + preguntasList.size());
//        System.out.println("El tamaño de la lista de respuesta es: " + respuestaList.size());
//
//        System.out.println("Lista que tiene? --> " + preguntasList.get(0).toString());
//        System.out.println("Lista que tiene? --> " + preguntasList.get(1).toString());


        //Boolean contiene = preguntasList.get(1).getPreguntas().contains("¿Que componenete es liquido?");

        //System.out.println("El valor de contiene es: " + contiene);

        for(int i=0; i<preguntasList.size(); i++){
            System.out.println("Pregunta " + i + " " +preguntasList.get(i).toString());
        }

        for(int i=0; i<respuestaList.size(); i++){
            System.out.println("Respuesta " + i + " " +respuestaList.get(i).toString());
        }

    }
    public void InicializarControles(){ tituloPregunta = findViewById(R.id.tvPreguntaN); }

    public void LlenarListaPreguntas(){
        pregunta = new Pregunta();

        pregunta.setCod_preg(1);
        pregunta.setPreguntas("¿Que es el Proceso Unificado Ágil (PUA)?");
        pregunta.setPreg_nivel("Nivel 1");

        preguntasList.add(pregunta);

        pregunta = new Pregunta();

        pregunta.setCod_preg(2);
        pregunta.setPreguntas("¿Qué tipo de marco de desarrollo de software es el Proceso Unificado Ágil (PUA)?");
        pregunta.setPreg_nivel("Nivel 1");

        preguntasList.add(pregunta);
    }

    public void LlenarListaRespuestas(){
        respuesta = new Respuesta();

        respuesta.setCod_resp(1);
        respuesta.setCod_preg(1);
        respuesta.setRespuestas("Describe de forma sencilla la forma de desarrollar software aplicando técnicas ágiles y conceptos del Proceso Unificado.");
        respuestaList.add(respuesta);

        respuesta = new Respuesta();

        respuesta.setCod_resp(2);
        respuesta.setCod_preg(2);
        respuesta.setRespuestas("Iterativo e incremental 2.");
        respuestaList.add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCod_resp(3);
        respuesta.setCod_preg(3);
        respuesta.setRespuestas("Scott Ambler.");
        respuestaList.add(respuesta);

        respuesta = new Respuesta();
        respuesta.setCod_resp(4);
        respuesta.setCod_preg(4);
        respuesta.setRespuestas("El desarrollo de prototipos ejecutables para refinar los requisitos y validar la arquitectura de los requisitos clave del producto. ?");
        respuestaList.add(respuesta);

    }
}