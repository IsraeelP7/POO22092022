
package libro.componentes;


public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor() {
    }

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    public void escribir(int paginas){
        System.out.println(this.getNombre()+ "está escribiendo" + paginas + "pp");
    }
    
}
