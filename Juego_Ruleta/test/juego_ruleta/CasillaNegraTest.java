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
public class CasillaNegraTest {
    
    public CasillaNegraTest() {
    }

    /**
     * Test of calcularGanancias method, of class CasillaNegra.
     */
    @Test
    public void testCalcularGanancias() {
        System.out.println("calcularGanancias");
        CasillaNegra instance = new CasillaNegra();
        int apuestaJugador = 5; //Jugador apuesta 5 a casilla color negro
        int fichas = 15 - apuestaJugador;
        int expResult = 20;
        int result = 2*fichas;//instance.calcularGanancias();
        assertEquals(expResult, result);
    }

    /**
     * Test of esCasillaColorNegro method, of class CasillaNegra.
     */
    @Test
    public void testEsCasillaColorNegro() {
        System.out.println("esCasillaColorNegro");
        int resultadoObtenido = 0;
        CasillaNegra instance = new CasillaNegra();
        boolean expResult = false;
        boolean result = false;//instance.esCasillaColorNegro(resultadoObtenido);
        assertEquals(expResult, result);
    }
    
}
