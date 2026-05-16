package org.modelo.POO;

public class Encapsulamiento {
    /*El encapsulamiento es algo muy importante ya que nos ayudara
    * a proteger los atributos, en vez de hacer uso despues de el punto como vimos
    * antes, se debe escribir:
    * getters y setters
    *
    *Por ejemplo
    * */

    private String nombre;

    //Getter
    Public String getNombre(){
        return nombre;
    }

    //Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
