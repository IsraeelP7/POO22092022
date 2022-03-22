
package tareacomposicion;

import DoctorSueno.Libro;
import libro.componentes.Autor;
import libro.componentes.Editorial;

import Shrek.Pelicula;
import peli.componentes.Actor;
import peli.componentes.Director;
import peli.componentes.Productora;

public class TareaComposicion {

   
    public static void main(String[] args) {
    
        Pelicula miPeli= new Pelicula();
        miPeli.setNombre("Shrek");
        miPeli.setLanzamiento(2001);
        miPeli.setActor(new Actor("Mike Myers", 58));
        miPeli.setDirector(new Director("Andrew Adamson","Los Angeles, California"));
        miPeli.setProductora(new Productora("DreamWorks Animation","Estados Unidos"));
        System.out.println( miPeli );
        
        System.out.println("Metodos Pelicula");
        miPeli.getActor().habla("Doy clases los Jueves, no cobro mucho");
        miPeli.getDirector().organiza(10);
        miPeli.getProductora().filma(250);
        System.out.println("------------------------------------");
        
        
        Libro miLibro= new Libro();
        miLibro.setNombre("Doctor Sueño");
        miLibro.setPaginas(531);
        miLibro.setAutor(new Autor("Stephen King", "estadounidense"));
        miLibro.setEditorial(new Editorial("Charles Scribner's Sons", "Estados Unidos"));
        System.out.println( miLibro );
        
        System.out.println("Metodos Libro");
        miLibro.getAutor().escribir(500);
        miLibro.getEditorial().imprimir(1000);
        System.out.println("---------------------------------");
     
    }
    
  
}
