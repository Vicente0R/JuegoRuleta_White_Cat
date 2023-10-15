/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ruleta;
import java.util.ArrayList;

/**
 *
 * @author Stefan2
 */
public class Ruleta {

    ArrayList<Casilla> casillas = new ArrayList<>();
    Casilla pares = new Casilla();
    Casilla impares = new Casilla();
    
    public Ruleta(){
        casillas.add(pares);
        casillas.add(impares);
    }
    
    
    public void calcularValorApuesta(int x, int y) {
        //FILA INFERIOR CON NÚMEROS 1,4,7,10,13....x >= 62 && x <= 562
        if (y >= 130 && y <= 188) {
            if (x >= 62 && x <= 102) {
                System.out.println("Apuesta al 1");
            }
            if (x >= 102 && x <= 145) {
                System.out.println("Apuesta al 4");
            }
            if (x >= 145 && x <= 185) {
                System.out.println("Apuesta al 7");
            }
            if (x >= 185 && x <= 229) {
                System.out.println("Apuesta al 10");
            }
            if (x >= 229 && x <= 270) {
                System.out.println("Apuesta al 13");
            }
            if (x >= 270 && x <= 312) {
                System.out.println("Apuesta al 16");
            }
            if (x >= 312 && x <= 354) {
                System.out.println("Apuesta al 19");
            }
            if (x >= 354 && x <= 396) {
                System.out.println("Apuesta al 22");
            }
            if (x >= 396 && x <= 438) {
                System.out.println("Apuesta al 25");
            }
            if (x >= 438 && x <= 480) {
                System.out.println("Apuesta al 28");
            }
            if (x >= 480 && x <= 521) {
                System.out.println("Apuesta al 31");
            }
            if (x >= 521 && x <= 564) {
                System.out.println("Apuesta al 34");
            }
        }

        //FILA DEL MEDIO CON NÚMEROS 2,5,8,11,14...
        if (y >= 74 && y <= 130) {
            if (x >= 62 && x <= 102) {
                System.out.println("Apuesta al 2");
            }
            if (x >= 102 && x <= 145) {
                System.out.println("Apuesta al 5");
            }
            if (x >= 145 && x <= 185) {
                System.out.println("Apuesta al 8");
            }
            if (x >= 185 && x <= 229) {
                System.out.println("Apuesta al 11");
            }
            if (x >= 229 && x <= 270) {
                System.out.println("Apuesta al 14");
            }
            if (x >= 270 && x <= 312) {
                System.out.println("Apuesta al 17");
            }
            if (x >= 312 && x <= 354) {
                System.out.println("Apuesta al 20");
            }
            if (x >= 354 && x <= 396) {
                System.out.println("Apuesta al 23");
            }
            if (x >= 396 && x <= 438) {
                System.out.println("Apuesta al 26");
            }
            if (x >= 438 && x <= 480) {
                System.out.println("Apuesta al 29");
            }
            if (x >= 480 && x <= 521) {
                System.out.println("Apuesta al 32");
            }
            if (x >= 521 && x <= 564) {
                System.out.println("Apuesta al 35");
            }
        }

        //FILA DEL SUPERIOR CON NÚMEROS 3,6,9,12,15,...
        if (y >= 16 && y <= 74) {
            if (x >= 62 && x <= 102) {
                System.out.println("Apuesta al 3");
            }
            if (x >= 102 && x <= 145) {
                System.out.println("Apuesta al 6");
            }
            if (x >= 145 && x <= 185) {
                System.out.println("Apuesta al 9");
            }
            if (x >= 185 && x <= 229) {
                System.out.println("Apuesta al 12");
            }
            if (x >= 229 && x <= 270) {
                System.out.println("Apuesta al 15");
            }
            if (x >= 270 && x <= 312) {
                System.out.println("Apuesta al 18");
            }
            if (x >= 312 && x <= 354) {
                System.out.println("Apuesta al 21");
            }
            if (x >= 354 && x <= 396) {
                System.out.println("Apuesta al 24");
            }
            if (x >= 396 && x <= 438) {
                System.out.println("Apuesta al 27");
            }
            if (x >= 438 && x <= 480) {
                System.out.println("Apuesta al 30");
            }
            if (x >= 480 && x <= 521) {
                System.out.println("Apuesta al 33");
            }
            if (x >= 521 && x <= 564) {
                System.out.println("Apuesta al 36");
            }
        }

        //CERO
        if (y >= 15 && y <= 188) {
            if (x >= 0 && x <= 60) {
                System.out.println("Apuesta a la casilla 0");
            }
        }

        //PRIMERA FILA DEL TABLERO
        if (y >= 236 && y <= 276) {
            if (x >= 230 && x <= 310) {
                System.out.println("Apuesta a la casilla pleno rojo");
            }
            if (x >= 314 && x <= 396) {
                System.out.println("Apuesta a la casilla plena negra");
            }
            //Impares
            if (x >= 146 && x <= 228) {
                System.out.println("Apuesta a la casilla impares");
            }
            //Pares
            if (x >= 397 && x <= 478) {
                System.out.println("Apuesta a la casilla pares");
            }
            //1 al 18
            if (x >= 62 && x <= 146) {
                System.out.println("Apuesta a la casilla 1 al 18");
            }
            //19 al 36
            if (x >= 478 && x <= 563) {
                System.out.println("Apuesta a la casilla 19 al 36");
            }
        }
    }
}
