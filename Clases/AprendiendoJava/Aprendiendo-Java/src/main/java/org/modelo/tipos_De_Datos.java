package org.modelo;

import java.util.ArrayList; //Este
public class tipos_De_Datos {

    //Forma de declaracion de valores en java
    int num = 100;
    double precio = 19.99;
    boolean esAdmin = true;
    String nombre = "Ricardo";

    //Var (Es usado para que el propio compilador deduzca el tipo de dato)
    public void usovar(){
    var nombre2 = "Paola"; // String
    var edad2 = 25; // int
    var precio2 = 19.99; //double
    var activo2 = false; //Boolean
    var list = new ArrayList<String>();
    /*Vamos a ver bien que es este ultimo var list, este plantea un nuevo objeto en la memoria para crear una lista
    * que determinara automaticamente el tipo y lleva a una lista dinamica que solo aceptara
    * datos de tipo string, al ser dinamico este crece y se encoge solo*/
    }
}
