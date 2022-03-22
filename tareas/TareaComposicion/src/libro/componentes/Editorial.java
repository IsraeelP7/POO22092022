
package libro.componentes;

public class Editorial {
    private String nombre;
    private String paisOrigen;

    public Editorial() {
    }

    public Editorial(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
    public void imprimir(int numeroLibros){
        System.out.println(this.getNombre()+ "está imprimiendo" + numeroLibros + "libros");
    }
    
}
