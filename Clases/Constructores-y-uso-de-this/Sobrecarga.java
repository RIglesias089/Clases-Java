public class Empleado {
    //La sobrecarga de constructores consiste en definir varios constructores
    //dentro de una misma clase, cada uno con diferentes numeros o tipos de
    //parametros.

    private String nombre;
    private String apellido;
    private float sueldo;
    private float totalDescuento;
    private float sueldoTotal;

    //Contructor por defecto
    public Empleado(){
    }

    //Constructo parametrizado
    public Empleado(String nombre, String apellido, float sueldo, float sueldoTotal){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.sueldoTotal = sueldoTotal;
    }



}