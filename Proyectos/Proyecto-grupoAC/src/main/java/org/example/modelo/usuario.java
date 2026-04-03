package org.example.modelo;

//Generamos la clase abstracta para el usuario y sus metodos
abstract class Usuario{
    String id;
    String nombre;
    String email;
    String constrasena;
    boolean premium; //Lo planteamos como bool porque asi solo decimos si es o no.

//Generamos el constructor para los nuevos usuarios
public Usuario(String id, String nombre, String email, String constrasena, boolean premium){
    this.id = id;
    this.nombre = nombre;
    this.email = email;
    this.constrasena = constrasena;
    this.premium = premium;
}

//Ahora realizamos los metodos que tendra esta clase para finalizar
    //Genero los metodos con void para que no devuelvan algo especifico

    //Creacion de grupos
    public void crearGrupo(String nombre){

    }

    //Incluir personas
    public void incluirPersonasGrupo(Usuario Usuario){

    }

    //Crear eventos
    public void crearEventos(){

    }

    //Eliminar eventos
    public void eliminarEventos(){

    }

    //Actualizar eventos
    public void actualizarEventos(){}

}