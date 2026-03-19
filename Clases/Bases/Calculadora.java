import java.util.Scanner;

public class Calculadora {
    //    Declaracion de funciones
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Operacion no valida");
            // return 0; el return va dentro del if y dentro de el else para que no genere conflicto
            //esto en caso de utilizar un else, en este caso no aplica
        }
        return a / b;
    }

    public static void main(String[] args) {
        
        //Diferencia entre print  y println es que print ln realiza un salto de linea
//        System.out.print(); mientras que print no realiza saltos de linea  y muestra la info en una misma linea
//        En cmd se utiliza el comando javac + nombre del archivo para generar el archivo .class
//        y el comando java para ejecutar el archivo. Ej javac nombre_archivo.java
//        java nombre_archivo
        System.out.println("A :p");
        int numero1 = 0;
        int numero2 = 0;
        int opcion = 0;
        int resultado = suma(4, 3);

        System.out.println("El resultado de la suma es: " + resultado);

//        SOLICITAR DATOS AL USUARIO
//        Se manda a llamar una liberia llamada Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
//        El atributo nextInt varia segun el tipo de variable en el que se guardara el dato
//        en este caso por ser variable entero se utiliza el atributo nextInt(), en caso de ser booleano
//        se guardaria como nextBool(), o como nextLine() en caso de ser string
        numero1 = entrada.nextInt();
        System.out.println("Digite otro numero: ");
        numero2 = entrada.nextInt();

        resultado = resta(numero1, numero2);
        System.out.println("Resultado de la resta " + numero1 + "-" + numero2 + "=" + resultado);

        System.out.println("Seleccione una opcion: \n" + "1.Suma\n 2.Resta\n 3. Multiplica\n 4.Dividir");
        opcion = entrada.nextInt();
        // en java existen dos tipos de switch, el de toda la vida (no lo hago porque ya me lo puedo xd
        //y uno moderno

//        switch(opcion){
//            case 1 -> System.out.println("Case 1");
//            case 2 -> System.out.println("Case 2");
//            default -> System.out.println("Default");
//        }

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + suma(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado: " + resta(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(numero1, numero2));
                break;
            case 4:
                System.out.println("Resultado: " + dividir(numero1, numero2));
                break;
            default:
                System.out.println("Opcion no valida");
        }
        entrada.close(); //Se cierra la memoria dinamica abierta con el metodo new de la libreria scanner

    }

}

