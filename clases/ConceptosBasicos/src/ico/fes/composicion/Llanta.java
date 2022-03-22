/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

/**
 *
 * @author israelpsiu7
 */
public class Llanta {
    private String marca;
    private String rodada;

    public Llanta() {
    }

    public Llanta(String marca, String rodad) {
        this.marca = marca;
        this.rodada = rodad;
    }

    public String getRodad() {
        return rodada;
    }

    public void setRodad(String rodad) {
        this.rodada = rodad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Llanta{" + "marca=" + marca + ", rodada=" + rodada + '}';
    }
    
    
    
}
