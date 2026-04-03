package org.example.modelo;

import java.time.LocalDate;

class EventoTarea extends Evento {

    boolean completado;

    public EventoTarea(String id_evento, String nombre_evento, String descripcion_evento, LocalDate fecha, boolean completado) {
        super(id_evento, nombre_evento, descripcion_evento, fecha);
        this.completado = completado;
    }

    void marcarComoCompletado() {
        this.completado = true;
    }
}