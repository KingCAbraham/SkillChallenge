package com.methaporce.modelo;

import com.methaporce.modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;
public class GestorPeliculas {
    private List<Pelicula> peliculas;
    public GestorPeliculas(){
        this.peliculas = new ArrayList<>();
    }
    public void agragarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public void eliminarPelicula(int id){
        Pelicula peliculaAEliminar = null;
        for (Pelicula pelicula : peliculas){
            if (pelicula.getId()== id){
                peliculas.remove(pelicula);
                break;
            }
        }
        if (peliculaAEliminar != null){
            peliculas.remove(peliculaAEliminar);
        }
    }
    public List<Pelicula> obtenerPeliculas(){
        return peliculas;
    }
    public List<Pelicula> obtenerPeliculasDisponibles(){
        List<Pelicula> peliculasDisponiles = new ArrayList<>();
        for (Pelicula pelicula : peliculas){
            if (pelicula.isDisponible()){
                peliculasDisponiles.add(pelicula);
            }
        }
        return peliculasDisponiles;
    }

    public List<Pelicula> obtenerPeliculasNoDisponibles(){
        List<Pelicula> peliculasNoDisponibles = new ArrayList<>();
        for (Pelicula pelicula:peliculas){
            if (!pelicula.isDisponible()){
                peliculasNoDisponibles.add(pelicula);
            }
        }
        return peliculasNoDisponibles;
    }

    public void marcarPeliculaComoDisponible(int id){
        for (Pelicula pelicula:peliculas){
            if (pelicula.getId()==id){
                pelicula.setDisponible(true);
                break;
            }
        }
    }
}
