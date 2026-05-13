package org.modelo;

public class dowhilee {


/*este se parece al while pero con la diferencia que se ejecuta al menos una vez
* el while pregunta primero, pero el do while ejecuta y despues pregunta, refiriendonos
* a la condicion que esta tendra.
* este cuenta con un break si es que quiere romper el ciclo en algun punto o el continue,
* que se saltara una vuelta en un punto especifico*/
    public static void main(String[] args){
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }
        while (i <= 5);
    }
}
