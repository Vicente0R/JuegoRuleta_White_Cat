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

    protected int apuesta;

    public Casilla() {
        this.apuesta = 0;
    }

    public int setApuesta(int apuesta) {
        return this.apuesta = apuesta;
    }

    public int getApuesta() {
        return apuesta;
    }

    public void incrementarFicha() {
        apuesta++;
    }

    @Override
    public String toString() {
        return "Apuesta: " + apuesta;
    }

    public int calcularGanancias() {
        return 0;
    }
}
