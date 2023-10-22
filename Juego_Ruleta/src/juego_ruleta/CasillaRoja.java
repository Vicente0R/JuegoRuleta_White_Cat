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
public class CasillaRoja extends Casilla {

    protected ArrayList<Integer> numerosCasillasRojas = new ArrayList<>();
    public boolean valorComparadoRojas;

    public CasillaRoja() {
        super.apuesta = 0;
        inicializarNumerosCasillasRojas();
    }

    @Override
    public int calcularGanancias() {
        return 2 * getApuesta();
    }

    private void inicializarNumerosCasillasRojas() {
        numerosCasillasRojas.add(1);
        numerosCasillasRojas.add(3);
        numerosCasillasRojas.add(5);
        numerosCasillasRojas.add(7);
        numerosCasillasRojas.add(9);
        numerosCasillasRojas.add(12);
        numerosCasillasRojas.add(14);
        numerosCasillasRojas.add(16);
        numerosCasillasRojas.add(18);
        numerosCasillasRojas.add(19);
        numerosCasillasRojas.add(21);
        numerosCasillasRojas.add(23);
        numerosCasillasRojas.add(25);
        numerosCasillasRojas.add(27);
        numerosCasillasRojas.add(30);
        numerosCasillasRojas.add(32);
        numerosCasillasRojas.add(34);
        numerosCasillasRojas.add(36);
    }

    public boolean esCasillaColorRojo(int resultadoObtenido) {
        valorComparadoRojas = false;
        for (Integer numeroCasillaRoja : numerosCasillasRojas) {
            if (numeroCasillaRoja == resultadoObtenido) {
                //System.out.println(numeroCasillaNegra);
                //System.out.println(resultadoObtenido);
                valorComparadoRojas = true;
            }

        }
        //System.out.println(valorComparado);
        return valorComparadoRojas;
    }

}
