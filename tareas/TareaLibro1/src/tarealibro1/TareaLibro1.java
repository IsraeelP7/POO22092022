
package tarealibro1;

public class TareaLibro1 {
   
    public static void main(String[] args) {
        Libro libro1 = new Libro ();
        libro1.setAutor("Cristiano Ronaldo");
        System.out.println("El autor del libro es: " + libro1.getAutor());
        
        libro1.setTitulo("La Historia de Mister Champions");
        System.out.println("El titulo del libro es: " + libro1.getTitulo());
        
        libro1.setEdicion("Septima Edicion");
        System.out.println("La edición del presente libro es: " + libro1.getEdicion());
        
        libro1.setPaginas("140");
        System.out.println("Numero de paginas: " + libro1.getPaginas());
        
        libro1.setGenero("Deportes");
        System.out.println("Genero: " + libro1.getGenero());
        
        libro1.setColor("Rojo pasion");
        System.out.println("El color del libro es: " + libro1.getColor());
        
    }
    
}
