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
        this.LlenarListaPreguntas();
        this.LlenarListaRespuestas();




//        System.out.println("El tamaño de la lista de preguntas es: " + preguntasList.size());
//        System.out.println("El tamaño de la lista de respuesta es: " + respuestaList.size());
//
//        System.out.println("Lista que tiene? --> " + preguntasList.get(0).toString());
//        System.out.println("Lista que tiene? --> " + preguntasList.get(1).toString());

        //Boolean contiene = preguntasList.get(1).getPregunta().contains("¿Que componenete es liquido?");

        //System.out.println("El valor de contiene es: " + contiene);

//        for(int i=0; i<preguntasList.size(); i++){
//            System.out.println("Pregunta " + i + " " +preguntasList.get(i).toString());
//        }
//
//        for(int i=0; i<respuestaList.size(); i++){
//            System.out.println("Respuesta " + i + " " +respuestaList.get(i).toString());
//        }

    }
    public void InicializarControles(){ tituloPregunta = findViewById(R.id.tvPreguntaN); }

    public void LlenarListaPreguntas(){
        pregunta = new Pregunta();

        pregunta.setId_pregunta(1);
        pregunta.setId_juego(3);
        pregunta.setPregunta("¿Que componenete es electrico?");
        pregunta.setTipo(1);
        pregunta.setLeccion(1);

        preguntasList.add(pregunta);

        pregunta = new Pregunta();

        pregunta.setId_pregunta(2);
        pregunta.setId_juego(3);
        pregunta.setPregunta("¿Que componenete es liquido?");
        pregunta.setTipo(1);
        pregunta.setLeccion(1);

        preguntasList.add(pregunta);
    }

    public void LlenarListaRespuestas(){
        respuesta = new Respuesta();
        respuesta.setId_resp(1);
        respuesta.setRespuesta("Lapiz");
        respuesta.setDescripcion("El lapiz es un componente para escribir");
        respuesta.setId_pregunta(1);
        respuestaList.add(respuesta);

        respuesta = new Respuesta();
        respuesta.setId_resp(1);
        respuesta.setRespuesta("Pan");
        respuesta.setDescripcion("El pan es un componente para comer");
        respuesta.setId_pregunta(1);
        respuestaList.add(respuesta);

        respuesta = new Respuesta();
        respuesta.setId_resp(1);
        respuesta.setRespuesta("Nevera");
        respuesta.setDescripcion("La nevera es un componente electrico");
        respuesta.setId_pregunta(1);
        respuestaList.add(respuesta);

        respuesta = new Respuesta();
        respuesta.setId_resp(1);
        respuesta.setRespuesta("Azucar");
        respuesta.setDescripcion("El azucar es un componente comestible");
        respuesta.setId_pregunta(1);
        respuestaList.add(respuesta);

        //-----------------------------------------------//

        respuesta = new Respuesta();
        respuesta.setId_resp(2);
        respuesta.setRespuesta("Roca");
        respuesta.setDescripcion("Es un componente solido");
        respuesta.setId_pregunta(2);
        respuestaList.add(respuesta);

        respuesta = new Respuesta();
        respuesta.setId_resp(2);
        respuesta.setRespuesta("Agua");
        respuesta.setDescripcion("Es un componente liquido");
        respuesta.setId_pregunta(2);
        respuestaList.add(respuesta);

        respuesta = new Respuesta();
        respuesta.setId_resp(2);
        respuesta.setRespuesta("Libro");
        respuesta.setDescripcion("Es un componente solido");
        respuesta.setId_pregunta(2);
        respuestaList.add(respuesta);

        respuesta = new Respuesta();
        respuesta.setId_resp(2);
        respuesta.setRespuesta("mesa");
        respuesta.setDescripcion("Es un componente solido");
        respuesta.setId_pregunta(2);
        respuestaList.add(respuesta);
    }
}