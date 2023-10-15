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
    
    public void incrementarFicha(){
        apuesta++;
    }
    
    public String toString(){
        return "Apuesta: " + apuesta;
    }
}
