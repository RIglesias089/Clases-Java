package org.example.modelo;

//Creamos la clase para el usuario clasico o "gratuito"

//Creamos el constructor que hereda nuestro usuario clasico para trabaar y solo cambiar el comportamiento
class UsuarioClasico extends Usuario{
    public UsuarioClasico(String id, String nombre, String email, String constrasena, boolean premium) {
        super(id, nombre, email, constrasena, premium);
    }
}

