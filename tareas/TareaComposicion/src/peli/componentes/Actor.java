
package peli.componentes;


public class Actor {
    private String nombre;
    private int edad;

    public Actor() {
    }

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void habla(String frases){
        System.out.println(this.getNombre()+ "está diciendo" + "frases" + "dialogo");
    }
   
}
