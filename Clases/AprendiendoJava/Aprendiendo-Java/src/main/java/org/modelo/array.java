package org.modelo;

public class array {
    /*Para empezar debemos saber qeu los arrays se usan mucho en programacion porqeu permiten
    * guardar datos realacionados a una sola variable, traducido al spanish, este es un "arreglo" el cual es
    * una estructura qeu guarda varios valores del mismo tipo, imaginandolo como una fila de cajas.
    *
    * este nos ayuda a pasar de tener qeu escribir dato por dato y loq ue contiene de la manera:
    *
    * int  n1 = 10;
    * int n2 = 20;
    * int n3 = 30;
    * int n4 = 40;
    *
    * a pasar a hacer un
    *
    * int[] numeros = {10,20,30,40};
    *
    * Como se ve el array tiene la forma:
    * tipo de dato[] nombre;
    * Es importante aclarar qeu los arryays se llaman con posiciones y estas arrancan desde la posicion 0, no 1, si no que
    * desde la posicion 0.
    *
    *
    * */

    //Arrays unidimensionales
    /*Es es un arreglo el cual guarda los datos en una sola linea, basicamente es una sola fila
    * una sola dimension, una sola fila, un indice para acceder y pubnto*/
    int[] numeros = {10, 20, 30, 40};
    //Arrays multidimensionales
    /*es un array que contiene a otrs arrays o un arreglo de varias dimensiones,  normalmente usado el bidimensional
    * o tambien llamado "matriz", este tiene varias filas */
    int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
    };
    //el uso de "[][]" es para indicar que es de dos dimensiones

    /*Para poder recorrer arrays multimensionales usamos un for anidados, */
    for (int fila = 0; fila < matriz.length; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            System.out.println(matriz[fila][columna]);

        }

    }


}
