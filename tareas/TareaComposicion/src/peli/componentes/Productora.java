
package peli.componentes;


public class Productora {
    private String nombre;
    private String paisOrigen;

    public Productora() {
    }

    public Productora(String nombre, String paisOrigen) {
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
        return "Productora{" + "nombre=" + nombre + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
    public void filma(int escenas){
        System.out.println(this.getNombre()+ "está filmando" + escenas + "en muchas Horas");
    }
    
}
