package org.modelo.fundamentos;

public class metodos {

    /*Los metodos son uno de los pilares en este lenguaje y es que son funadamentales ya que nos permiten
    organizar el codigo
    reutilizar el codigo
    dividir probelmas grandes
    evitar repetir instrucciones

    el metodo es un bloque de codigo que realiza una trea especifica, practicamente es como
    las funciones en lenguajes como C++, ya que estos los usamos para poder hacer qeu tome ciertas cosas y
    haga operaciones o trabajos con ellos y devuelva algo , ahi entra algo muy importante y son los tipos de metodos

   - los void (no devuelve nada y se usa para hcer procesos especificos y ya)
   - int (usado para que devuelva numeros enteros, se usa para operaciones matematicas enteras
   - double (usado para que devuelva decimales) aca ya podemos hacer oepraciones tipo divisiones y demas
   - String (usado para que devuelva texto, evalua nombres y demas)
   - boolean( usado para qeu devuelva un verdadero o falso)

   en casos hay metodos que podemos evaluar incluso con arrays y metodos con objetos pero los veremos mas adelante.
    * */

    //public porque el metodo se puede usar dede cualqueir parte del codigo
    //static porque pertenece a la clase no a un objeto
    //
    public static void saludar(){
        //el metodo lelva por nombre "saludar"
        System.out.println("Hola mundo"); //el metodo imprime un "hoola mundo"
    }

    /*en los metodos tambien hay algo llamado "sobrecarga de metodos", este es crear varios metodos con el mismo nombre
    * pero que contara con ciertas diferencias como parametros, cantidad o inlcuso los tipos de datos de el emtod, esto
    * existe gracias a que a veces se quiere hacer la misma accion pero con diferentes datos.
    *
    *
    * */
    public static class metodoss {

        //creamos los tres metodos llamados sumas pero con diferente tipo de dato
        public static int sumar(int a, int b) {
            return a + b;
        }

        public static double sumar(double a, double b) {
            return a + b;
        }

        public static int sumar(int a, int b, int c) {
            return a + b + c;
        }

    }



}
