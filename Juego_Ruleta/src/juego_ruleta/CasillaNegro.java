/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ruleta;

/**
 *
 * @author Vicente Rico
 */
public class CasillaNegro extends Casilla{
    public CasillaNegro() {
        super.apuesta = 0;
    }
    @Override
    public int calcularGanancias() {
        return 2 * getApuesta();
    }
}
