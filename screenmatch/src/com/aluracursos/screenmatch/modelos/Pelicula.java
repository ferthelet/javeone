package com.aluracursos.screenmatch.modelos;
import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    // constructor
    public Pelicula(String nombre) {
        this.setNombre(nombre);
    }

    // gets /sets
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }
    
}
