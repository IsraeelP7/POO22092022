
package peli.componentes;


public class Director {
    private String nombre;
    private String ciudadOrigen;

    public Director() {
    }

    public Director(String nombre, String ciudadOrigen) {
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", ciudadOrigen=" + ciudadOrigen + '}';
    }
    
    public void organiza(int personajes){
        System.out.println(this.getNombre()+ "está acomodando" + personajes + "Del mas importante al menos importante");
    }
    
}
