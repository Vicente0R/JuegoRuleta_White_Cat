/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ruleta;

/**
 *
 * @author Stefan2
 */
public class CasillaPleno extends Casilla{
    //Números 0 al 36
    int numero;
    //Colores: Rojo, negro o verde (0)
    String color;

    public CasillaPleno(int numero, String color) {
        this.numero = numero;
        this.color = color;
        super.apuesta = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int calcularGanancias() {
        //Coloque asi porque en la ruleta Pleno o número entero
        //el jugador que gana obtiene 35 veces su apuesta en cualquier
        //casilla pleno
        return getApuesta() * 36; 
    }
    
    
}
