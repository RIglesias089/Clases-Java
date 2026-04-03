package org.example.modelo;
//en este caso hacemos una clase concreta, para los grupos
class Grupo{
    String id_grupo;
    String nombre_grupo;
    String descripcion_grupo;
    //tareas List<Tareas>;, este queda como comentario porque ya es para mas adelante
    //recoratorios List<Recordatorios>;, igual que este

    //Creamos el constructor
    public Grupo (String id_grupo,String nombre_grupo,String descripcion_grupo){
        this.id_grupo = id_grupo;
        this.nombre_grupo = nombre_grupo;
        this.descripcion_grupo = descripcion_grupo;
    }

    //Ahora creamos los metodos que tendra
    //mostrar inormacion
    public void mostrarInfo(){

    }
}
