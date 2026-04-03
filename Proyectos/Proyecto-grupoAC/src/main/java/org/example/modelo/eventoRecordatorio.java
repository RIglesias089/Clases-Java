package org.example.modelo;

import java.time.LocalDate;

class EventoRecordatorio extends Evento {

    String prioridad;  // alta, media, baja dependiendo lo que sea

    public EventoRecordatorio(String id_evento, String nombre_evento, String descripcion_evento, LocalDate fecha, String prioridad) {
        super(id_evento, nombre_evento, descripcion_evento, fecha);
        this.prioridad = prioridad;
    }
}