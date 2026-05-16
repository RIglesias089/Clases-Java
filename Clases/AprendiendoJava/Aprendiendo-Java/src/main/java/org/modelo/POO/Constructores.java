package org.modelo.POO;

public class Constructores {
    /*Los contructores son muy importantes ya que nos sirven
    * para poder inicializar los objetos, a raiz de la creacion
    * de un objeto luego el metodo ahora debemos inicializarlo, por ejemplo*/

    //Creamos la clase
    class Persona {

        //Planteamos los atributos
        String nombre;
        int edad;

        //Creamos el constructor con nombre de persona
        public Persona(String nombre, int edad) {

            //damops uso depsues de el contructor para inicializar los objetos
            this.nombre = nombre;
            this.edad = edad;

        }

    }

}
