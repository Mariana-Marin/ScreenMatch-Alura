package Modelos;

import Calculos.Clasificacion;


public class Pelicula extends Titulo implements Clasificacion {

    // Atributos
    private String director;

    //getter
    public String getDirector() {
        return director;
    }

    //Setter
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);

    }
}


