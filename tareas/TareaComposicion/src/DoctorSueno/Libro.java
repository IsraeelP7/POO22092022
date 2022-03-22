
package DoctorSueno;

import libro.componentes.Autor;
import libro.componentes.Editorial;


public class Libro {
    private String nombre;
    private int paginas;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String nombre, int paginas, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", paginas=" + paginas + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
    
}
