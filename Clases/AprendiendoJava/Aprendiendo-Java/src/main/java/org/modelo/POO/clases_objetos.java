package org.modelo.POO;

public class clases_objetos {

    
    //Definimos la clase persona
    class Persona{
        //planteamos los atributos que tendra dicha clase
        String nombre;
        int edad;
    }

    /*El objeto es una isntancia de una clase, en palabras mas simples
    * la clase es el molde y el objeto sera la cosa creada usando el molde
    * */

    //Creamnos la instancia de el objeto
    Persona persona1 = new Persona(); //el new Persona() crea al objeto en la memoria.

    //Persona es el tipo de objeto, personal el nombre de la variable, new crea el objeto, persona() es el constructor

    //Para acceder a los atributos usamos el operador de el punto.
    persona1 = "Ricardo";
    persona1.edad = 19

    //Leemos los datos
    System.out.println(persona1.nombre);
}
