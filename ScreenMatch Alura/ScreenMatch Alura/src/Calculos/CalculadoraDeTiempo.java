package Calculos;

import Modelos.Pelicula;
import Modelos.Serie;
import Modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye (Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();

    }

}
