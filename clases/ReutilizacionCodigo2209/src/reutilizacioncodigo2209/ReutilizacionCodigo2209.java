/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import javax.swing.JFrame;

/**
 *
 * @author israelpsiu7
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
        
        Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println( miCompu);
        
        //Ejercicio: Establecer un mouse marca Logitec tipo óptico
        miCompu.setRaton(new Mouse("Logitec", "optico"));
        System.out.println( miCompu );
        
        Computadora compu2 =new Computadora("Apple", "Macbook Pro",
                new Monitor("Toshiba",14.3f),
                new Mouse("Acteck", "optico"),
                new Teclado("Apple", 101),
                new Procesador("M1",3.4f));
        System.out.println(compu2);
        
        System.out.println("____________________________________________");
        Alumno alu1=new Alumno();
        alu1.setNombre("Jose");
        System.out.println( alu1 );
        
        Alumno alu2 = new Alumno("319023718","ICO","J0sé Perex",19);
        System.out.println( alu2 );
        
        //Ejercicio 2, objeto 2: Cambiar el estado del raton;
        compu2.setRaton(new Mouse("Apple","Touch"));
        System.out.println(compu2);
        /*opcion2
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        */
        
      
    }
    
}
