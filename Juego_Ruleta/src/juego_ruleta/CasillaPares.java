/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ruleta;

/**
 *
 * @author Vicente Rico
 */
public class CasillaPares extends Casilla {

    public CasillaPares() {
        super.apuesta = 0;
    }
    
    @Override
    public int calcularGanancias() {
        return 2 * getApuesta(); 
    }

}
