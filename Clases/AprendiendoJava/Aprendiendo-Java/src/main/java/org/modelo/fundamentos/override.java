package org.modelo.fundamentos;

public class override {
    /*Los override son metodos de sobrescritura para los emtodos, remplaza un metodo heredado de otro
    * la clase hija hereda el metodo de la clase padre pero decide hacer su propia version
    * dada una clase padre por ejemplo:
    * class Animal {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

}
*
* La clase hija seria algo asi
* */
    class Perro extends Animal {

        @Override
        public void hacerSonido() {
            System.out.println("Guau guau");
        }

    }
    //Aunque salga ocn error no significa que lo este
/*Es importante termina con aclarar que:
* Sobrecarga(Overloading):
* mismo nombre el metodo, diferente tipo de parametros
*
* Sobrescritura (Override):
* Mismo nombre, Mismo parametro, pero en clase hija sobrescribe y hace su propia version.*/

}
