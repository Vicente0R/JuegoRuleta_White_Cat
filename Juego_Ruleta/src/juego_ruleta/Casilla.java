/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ruleta;

/**
 *
 * @author Stefan2
 */
public class Casilla {

    int apuesta;

    public Casilla() {
        this.apuesta = 0;
    }

    public void incrementarFicha() {
        apuesta++;
    }
    
    public String toString() {
        return "Apuesta: " + apuesta;
    }
    
    public int setApuesta(int apuesta){
        return this.apuesta = apuesta;
    }
    public int getApuesta() {
        return apuesta;
    }
}
