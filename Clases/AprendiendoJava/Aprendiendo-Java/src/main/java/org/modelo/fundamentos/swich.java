package org.modelo.fundamentos;

public class swich {
    /*Aca veremos como funciona el swich en Java, este es usado sobretodo
    * como una manera de elegir entre muchas opciones, uti para menus, opciones
    * estados o incluso para comandos*/


    public static void main(String[] args){
        int opcion = 2;

        switch (opcion) {

            case 1: //Estos representan cada caso en el que se ponga dicho numero
                System.out.println("Jugar");
                break;//esto hace que solo ejecute un caso, detiene los demas, sin esto lso demas casos se siguen ejecutando

            case 2:
                System.out.println("Configuración");
                break;

            case 3:
                System.out.println("Salir");
                break;

            default:
                System.out.println("Opción inválida");
        }
    }

}
