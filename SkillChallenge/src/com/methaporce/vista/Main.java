package com.methaporce.vista;

import com.methaporce.modelo.GestorPeliculas;
import com.methaporce.modelo.Pelicula;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Pelicula pelicula1 = new Pelicula(1, "Scar Face",true);
        Pelicula pelicula2 = new Pelicula(2, "Forest Gump",false);
        Pelicula pelicula3 = new Pelicula(3, "Diario de una pasión",false);

        GestorPeliculas gestor = new GestorPeliculas();
        gestor.agragarPelicula(pelicula1);
        gestor.agragarPelicula(pelicula2);
        gestor.agragarPelicula(pelicula3);

        int idAEliminar = 2;
        gestor.eliminarPelicula(idAEliminar);
        System.out.println("com.methaporce.modelo.Pelicula eliminada " + idAEliminar + "Nombre: " + pelicula2.getNombre());

        int idMarcarDisponible = 1;
        gestor.marcarPeliculaComoDisponible(idMarcarDisponible);
        System.out.println("com.methaporce.modelo.Pelicula marcada como disponible: " + idMarcarDisponible);

        List<Pelicula> peliculasNoDisponibles = gestor.obtenerPeliculasNoDisponibles();
        System.out.println("Peliculas no disponibles");
        for (Pelicula pelicula:peliculasNoDisponibles){
            System.out.println("ID" + pelicula.getId() + ", Nombre: " + pelicula.getNombre());
        }
    }
}