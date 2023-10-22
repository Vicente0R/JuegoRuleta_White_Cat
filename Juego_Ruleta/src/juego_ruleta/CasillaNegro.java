/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ruleta;

import java.util.ArrayList;

/**
 *
 * @author Vicente Rico
 */
public class CasillaNegro extends Casilla {

    protected ArrayList<Integer> numerosCasillasNegras = new ArrayList<>();
    public boolean valorComparado;

    public CasillaNegro() {
        super.apuesta = 0;
        inicializarNumerosCasillasNegras();
    }

    @Override
    public int calcularGanancias() {
        return 2 * getApuesta();
    }

    private void inicializarNumerosCasillasNegras() {
        numerosCasillasNegras.add(2);
        numerosCasillasNegras.add(4);
        numerosCasillasNegras.add(6);
        numerosCasillasNegras.add(8);
        numerosCasillasNegras.add(10);
        numerosCasillasNegras.add(11);
        numerosCasillasNegras.add(13);
        numerosCasillasNegras.add(15);
        numerosCasillasNegras.add(17);
        numerosCasillasNegras.add(20);
        numerosCasillasNegras.add(22);
        numerosCasillasNegras.add(24);
        numerosCasillasNegras.add(26);
        numerosCasillasNegras.add(28);
        numerosCasillasNegras.add(29);
        numerosCasillasNegras.add(31);
        numerosCasillasNegras.add(33);
        numerosCasillasNegras.add(35);
    }

    public boolean esCasillaColorNegro(int resultadoObtenido) {
        valorComparado = false;
        for (Integer numeroCasillaNegra : numerosCasillasNegras) {
            if (numeroCasillaNegra == resultadoObtenido) {
                //System.out.println(numeroCasillaNegra);
                //System.out.println(resultadoObtenido);
                valorComparado = true;
            }
            
        }
        //System.out.println(valorComparado);
        return valorComparado;
    }

}
