
package Shrek;

import peli.componentes.Productora;
import peli.componentes.Actor;
import peli.componentes.Director;

public class Pelicula {
    
    private String nombre;
    private int lanzamiento;
    private Actor actor;
    private Director director;
    private Productora productora;

    public Pelicula() {
    }

    public Pelicula(String nombre, int lanzamiento, Actor actor, Director director, Productora productora) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.actor = actor;
        this.director = director;
        this.productora = productora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", lanzamiento=" + lanzamiento + ", actor=" + actor + ", director=" + director + ", productora=" + productora + '}';
    }
    
    
    
    
            
    
    
}
