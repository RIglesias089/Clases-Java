package org.example.modelo;

//creamos el archivo para el usuario premium

//Creamos el constructor que hereda lo de el usuario base
class UsuarioPremium extends Usuario {

    UsuarioPremium(String id, String nombre, String email, String contrasena) {
        super(id, nombre, email, contrasena, true);
    }
}