/*
Es una forma en la que Java nos ayuda a generar
documentacion automaica en HTML, a partir de comentarios
especiales que se encuentren en el codigo de Java.
 */

/**
 * Esta clase representa una persona
 */
public class Persona {

    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Constructor de la clase Persona
     * @param nombre nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Muestra un saludo
     */
    public void saludar() {
        System.out.println("Hola " + nombre);
    }
}

//Para poder generar el JavaDoc desde la terminal deberemos ingresar:
// javadoc -d docs NombreArchivo.java

