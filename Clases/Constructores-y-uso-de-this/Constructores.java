import java.util.Scanner;

public class Empleado{

    //Un constructor es un metodo que inicializa un objeto cuando se crea
    //Esto es lo primero que se ejecuta al iniciarlo, su funcion basicamente es
    //inicializar los atributos de las clases y declarar publico para poder crear objetos
    //desde cualquier parter de el programa

    //constructor parametrizado
    private String nombre;
    private String apellido;
    private float sueldo;
    private float totalDescuentos;
    private float sueldoTotal;
    public Empleado(String nombre, String apellido, float sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.totalDescuentos = 0;
    }
    //metodo Getter
    public String getNombre(){
        return nombre;
    }
    //Metodo setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}

