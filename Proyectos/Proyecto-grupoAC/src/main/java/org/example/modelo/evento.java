package org.example.modelo;

import java.time.LocalDate;

//Creamos la clase base para la division de eventos sean atareas o recordatorios
abstract class Evento{
    String id_evento;
    String nombre_evento;
    String descripcion_evento;
    LocalDate fecha;
    //creador Usuario; debe presentar el nombre e el crador

    //Creamos el constructor
    public Evento(String id_evento, String nombre_evento, String descripcion_evento, LocalDate fecha) {
        this.id_evento = id_evento;
        this.nombre_evento = nombre_evento;
        this.descripcion_evento = descripcion_evento;
        this.fecha = fecha;
    }

    //Creamos los metodos que tendra

}