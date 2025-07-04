// Importa las clases Pelicula y Serie desde el paquete Modelos
import Calculos.CalculadoraDeTiempo;
import Calculos.FiltroRecomendacion;
import Modelos.Episodio;
import Modelos.Pelicula;
import Modelos.Serie;

// Clase principal con el metodo main (punto de entrada del programa)
public class Principal {
    public static void main(String[] args) {

        //************ PELICULAS ***************

        // Crea un nuevo objeto de tipo Pelicula
        Pelicula miPelicula = new Pelicula();

        // Asigna valores a los atributos usando setters
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        // Muestra la ficha técnica de la película (nombre, año, duración)
        miPelicula.muestraFichaTecnica();

        // Registra evaluaciones (notas) para calcular un promedio
        miPelicula.evalua(10); // Primera evaluación
        miPelicula.evalua(10); // Segunda evaluación

        //************ SERIES ***************

        // Crea un nuevo objeto de tipo Serie
        Serie casaDragon  = new Serie();

        // Asigna valores a los atributos usando setters
        casaDragon.setNombre("Dragon");
        casaDragon.setFechaDeLanzamiento(2021);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(8);
        casaDragon.setMinutosPorEpisodio(80);

        // Muestra la ficha técnica de la serie
        casaDragon.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("Targaryen");
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodio);



    }
}

