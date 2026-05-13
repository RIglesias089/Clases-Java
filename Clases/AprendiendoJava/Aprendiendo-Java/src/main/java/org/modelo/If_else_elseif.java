package org.modelo;

public class If_else_elseif {
    /*Ahora veremos el uso de el if, else, else if, para poder hacer
    * decisiones basicas en java, su sintaxis y buen uso.
    * */

    /*Normalmente no se usaria esto en una clase dentro de la carpeta modelo,
    * por el hecho de que en modelo solo se [lantean clases que se llamaran al main
    * donde esta parte si ira, pero en este caso haremos la excepcion por el hecho que
    * lo necesitamos para que peueda usar el if, aunque el if plantea que siempre sera verdadero
    * de momento planteara que el metodo pertenece a la calse y no a un objeto
    * */
    public static void main(String[] args) {
        //creamos la variable
        int edad = 17;

        //evaluamos con el if dicha edad
        if(edad >= 19){
            System.out.println("El valor de edad es menor a 18");
        }else if (edad == 17){ //el else if es para que si no pasa una cosa pase otra siempre siguiendo una condicion de por medio
            System.out.println("El valor tiene edad de 17");
        } else { //el else es el cierre ya que si no pasa n inguna de las anteriores entonces cerrara diciendo una cosa y punto, su condicion es que las demas no se cumplan
            System.out.println("El valor de edad es menor a 18");
        }
    }





}
