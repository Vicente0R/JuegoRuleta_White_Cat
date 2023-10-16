/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ruleta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefan2
 */
public class Ruleta {

    /**
     * @return the fichas
     */
    public int getFichas() {
        return fichas;
    }

    /**
     * @param fichas the fichas to set
     */
    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    ArrayList<Casilla> casillas = new ArrayList<>();
    Casilla pares = new CasillaPares();
    Casilla impares = new CasillaImpares();
    //Casilla uno = new Casilla();
    private int fichas = 15; // Momentaneo para simular que inicio con 8 fichas

    public Ruleta() {
        casillas.add(pares);
        casillas.add(impares);
        //casillas.add(uno);//Aquí ir agregando para el resto de las casillas
        //Agregando objeto CasillaPleno
        casillas.add(new CasillaPleno(1, "Rojo"));
        casillas.add(new CasillaPleno(4, "Negro"));
        casillas.add(new CasillaPleno(7, "Rojo"));
        casillas.add(new CasillaPleno(10, "Negro"));
        casillas.add(new CasillaPleno(13, "Negro"));
        casillas.add(new CasillaPleno(16, "Rojo"));
        casillas.add(new CasillaPleno(19, "Rojo"));
        casillas.add(new CasillaPleno(22, "Negro"));
        casillas.add(new CasillaPleno(25, "Rojo"));
        casillas.add(new CasillaPleno(28, "Negro"));
        casillas.add(new CasillaPleno(31, "Negro"));
        casillas.add(new CasillaPleno(34, "Rojo"));
    }

    public void mostrarApuestaRealizada() {
        for (Casilla casilla : casillas) {
            System.out.println(casilla);
        }
    }

    public void girar() {
        //Aleatoriedad 
        //Haciendo un random para obtener número entre 0 y 36
        int resultadoObtenido = (int) (Math.random() * 37);
        
        /*SOLO DESCOMENTAR MI LINEA 68 PARA PRUEBAS
        PARA NO ESTAR LANZANDO RULETA N VECES HASTA OBTENER UNA CASILLA PLENO*/
        //resultadoObtenido = 4; //Solo para probar forzamos el valor 
        //obtenido en la ruleta
        
        JOptionPane.showMessageDialog(null, resultadoObtenido);

        //Gestión de premios o pagos
        //Lógica inicial para cálculo de pago de apuesta
        boolean par = (resultadoObtenido % 2 == 0);
        boolean impar = (resultadoObtenido % 2 != 0);
        if (resultadoObtenido == 0) {

        } else if (par) {
            //System.out.println("Pago (casilla par): " + (2 * pares.getApuesta()));
            //setFichas(getFichas() + (2 * pares.getApuesta()));
            fichas = fichas + pares.calcularGanancias();
        } else if (impar) {
            //System.out.println("Pago (casilla impar): " + (2 * impares.getApuesta()));
            //setFichas(getFichas() + (2 * impares.getApuesta()));
            fichas = fichas + impares.calcularGanancias();
        } else {
            //System.out.println("Premio para otro número");
        }

        //Gestión apuestas reinicio
        for (Casilla casilla : casillas) {
            if (casilla instanceof CasillaPleno) {
                //Capturar la casilla
                CasillaPleno pleno = (CasillaPleno) casilla;
                //Obtener número de la casilla y compara con res de ruleta
                if (pleno.getNumero() == resultadoObtenido) {
                    fichas = fichas + casilla.calcularGanancias();
                }
            }
            casilla.setApuesta(0);
        }
    }

    public void calcularValorApuesta(int x, int y) {
        //FILA INFERIOR CON NÚMEROS 1,4,7,10,13....x >= 62 && x <= 562
        if (y >= 130 && y <= 188) {
            if (x >= 62 && x <= 102) {
                //uno.incrementarFicha();
                //System.out.println("Apuesta al 1");
                casillas.get(2).incrementarFicha();
            }
            if (x >= 102 && x <= 145) {
                //System.out.println("Apuesta al 4");
                casillas.get(3).incrementarFicha();
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
            //Todas las casillas rojas (Pleno rojo)
            if (x >= 230 && x <= 310) {
                System.out.println("Apuesta a la casilla pleno rojo");
            }
            //Todas las casillas negras (Pleno negro)
            if (x >= 314 && x <= 396) {
                System.out.println("Apuesta a la casilla plena negra");
            }
            //Pares
            if (x >= 146 && x <= 228) {
                pares.incrementarFicha();
                System.out.println("Apuesta a la casilla pares");
            }
            //Impares
            if (x >= 397 && x <= 478) {
                impares.incrementarFicha();
                System.out.println("Apuesta a la casilla impares");
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
        if(fichas > 0){
            fichas--;
        }
        else{
            System.out.println("Se quedó sin fichas!!");
            JOptionPane.showMessageDialog(null, "Se quedó sin fichas!!. Game Over!");
            System.exit(fichas);
        }
    }

}
