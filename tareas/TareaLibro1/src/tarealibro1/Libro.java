
package tarealibro1;


public class Libro {
    
    private String color;
    private String titulo;
    private String paginas;
    private String edicion;
    private String genero;
    private String autor;

    public Libro() {
    }

    public Libro(String color, String titulo, String paginas, String edicion, String genero, String autor) {
        this.color = color;
        this.titulo = titulo;
        this.paginas = paginas;
        this.edicion = edicion;
        this.genero = genero;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
}
