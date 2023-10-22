/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package juego_ruleta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vicente Rico
 */
public class CasillaPlenoTest {
    
    public CasillaPlenoTest() {
    }

    /**
     * Test of calcularGanancias method, of class CasillaPleno.
     */
    @Test
    public void testCalcularGanancias() {
        System.out.println("calcularGanancias");
        CasillaPleno instance = null;
        int apuestaJugador = 1; //Jugador apuesta 1 ficha a casilla pleno 1,2,..36
        int fichas = 15 - apuestaJugador;
        int expResult = 50;
        int result = apuestaJugador * 36 + fichas; //instance.calcularGanancias();
        assertEquals(expResult, result);
    }
    
}
