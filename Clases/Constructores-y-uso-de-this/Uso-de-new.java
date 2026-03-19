public class Empleado {

    //New es una paabra clave en Java que se usa para crear (instanciar) un objeto o clase.
    //con eso reservamos memoria y llama al constructor de la clase para inicializarlo.
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

    public class main {
    public static void main(String[] args) {
        //crear objeto usando el contructor por defecto
        Empleado emp1 = new Empleado();
        //crear objeto usando el constructor por parametros
        Empleado emp2 = new Empleado ("Juan", "Perez", 1500);
        //Mostrar mensaje para comprobar la creacion
        System.out.println("Empleado creado con constructor por defecto");
        System.out.println("Empleado creado: Juan Perez  con sueldo 1500");
    }
}