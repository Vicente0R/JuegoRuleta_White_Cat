/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ruleta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vicente Rico
 */
public class Juego_de_la_Ruleta implements Juego_Casino {

    protected ArrayList<Casilla> casillas = new ArrayList<>();
    Casilla pares = new CasillaPares();
    Casilla impares = new CasillaImpares();
    //Casilla uno = new Casilla();
    CasillaRoja rojas = new CasillaRoja();
    CasillaNegra negras = new CasillaNegra();

    private int fichas;

    public Juego_de_la_Ruleta(int fichas) {
        aniadiendoCasillas();
        this.fichas = fichas;
    }

    /**
     * @return the fichas
     */
    @Override
    public int getFichas() {
        return fichas;
    }

    /**
     * @param fichas the fichas to set
     */
    @Override
    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    @Override
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
        if (par && resultadoObtenido != 0) {
            //System.out.println("Pago (casilla par): " + (2 * pares.getApuesta()));
            //setFichas(getFichas() + (2 * pares.getApuesta()));
            fichas = fichas + pares.calcularGanancias();
        } else if (impar) {
            //System.out.println("Pago (casilla impar): " + (2 * impares.getApuesta()));
            //setFichas(getFichas() + (2 * impares.getApuesta()));
            fichas = fichas + impares.calcularGanancias();
        } else {
            //System.out.println("Otra opción");
        }

        //System.out.println(resultadoObtenido);
        if (negras.esCasillaColorNegro(resultadoObtenido)
                && negras.getApuesta() != 0) {
            //System.out.println("esta entrando negras");
            fichas = fichas + negras.calcularGanancias();
            //negras.setApuesta(0);
        }
        else if (rojas.esCasillaColorRojo(resultadoObtenido)
                && rojas.getApuesta() != 0) {
            //System.out.println("esta entrando rojas");
            fichas = fichas + rojas.calcularGanancias();
            //rojas.setApuesta(0);
        }
        negras.setApuesta(0);
        rojas.setApuesta(0);
        //Gestión apuestas más reinicio
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

    @Override
    public void calcularValorApuesta(int x, int y) {
        //FILA INFERIOR CON NÚMEROS 1,4,7,10,13....x >= 62 && x <= 562
        if (y >= 130 && y <= 188) {
            if (x >= 62 && x <= 102) {
                System.out.println("Apuesta al 1");
                incrementarFichaEnCasillaDelTablero(2);
            } else if (x >= 102 && x <= 145) {
                System.out.println("Apuesta al 4");
                incrementarFichaEnCasillaDelTablero(3);
            } else if (x >= 145 && x <= 185) {
                System.out.println("Apuesta al 7");
                incrementarFichaEnCasillaDelTablero(4);
            } else if (x >= 185 && x <= 229) {
                System.out.println("Apuesta al 10");
                incrementarFichaEnCasillaDelTablero(5);
            } else if (x >= 229 && x <= 270) {
                System.out.println("Apuesta al 13");
                incrementarFichaEnCasillaDelTablero(6);
            } else if (x >= 270 && x <= 312) {
                System.out.println("Apuesta al 16");
                incrementarFichaEnCasillaDelTablero(7);
            } else if (x >= 312 && x <= 354) {
                System.out.println("Apuesta al 19");
                incrementarFichaEnCasillaDelTablero(8);
            } else if (x >= 354 && x <= 396) {
                System.out.println("Apuesta al 22");
                incrementarFichaEnCasillaDelTablero(9);
            } else if (x >= 396 && x <= 438) {
                System.out.println("Apuesta al 25");
                incrementarFichaEnCasillaDelTablero(10);
            } else if (x >= 438 && x <= 480) {
                System.out.println("Apuesta al 28");
                incrementarFichaEnCasillaDelTablero(11);
            } else if (x >= 480 && x <= 521) {
                System.out.println("Apuesta al 31");
                incrementarFichaEnCasillaDelTablero(12);
            } else if (x >= 521 && x <= 564) {
                System.out.println("Apuesta al 34");
                incrementarFichaEnCasillaDelTablero(13);
            }
        }

        //FILA DEL MEDIO CON NÚMEROS 2,5,8,11,14...
        if (y >= 74 && y <= 130) {
            if (x >= 62 && x <= 102) {
                System.out.println("Apuesta al 2");
                incrementarFichaEnCasillaDelTablero(14);
            } else if (x >= 102 && x <= 145) {
                System.out.println("Apuesta al 5");
                incrementarFichaEnCasillaDelTablero(15);
            } else if (x >= 145 && x <= 185) {
                System.out.println("Apuesta al 8");
                incrementarFichaEnCasillaDelTablero(16);
            } else if (x >= 185 && x <= 229) {
                System.out.println("Apuesta al 11");
                incrementarFichaEnCasillaDelTablero(17);
            } else if (x >= 229 && x <= 270) {
                System.out.println("Apuesta al 14");
                incrementarFichaEnCasillaDelTablero(18);
            } else if (x >= 270 && x <= 312) {
                System.out.println("Apuesta al 17");
                incrementarFichaEnCasillaDelTablero(19);
            } else if (x >= 312 && x <= 354) {
                System.out.println("Apuesta al 20");
                incrementarFichaEnCasillaDelTablero(20);
            } else if (x >= 354 && x <= 396) {
                System.out.println("Apuesta al 23");
                incrementarFichaEnCasillaDelTablero(21);
            } else if (x >= 396 && x <= 438) {
                System.out.println("Apuesta al 26");
                incrementarFichaEnCasillaDelTablero(22);
            } else if (x >= 438 && x <= 480) {
                System.out.println("Apuesta al 29");
                incrementarFichaEnCasillaDelTablero(23);
            } else if (x >= 480 && x <= 521) {
                System.out.println("Apuesta al 32");
                incrementarFichaEnCasillaDelTablero(24);
            } else if (x >= 521 && x <= 564) {
                System.out.println("Apuesta al 35");
                incrementarFichaEnCasillaDelTablero(25);
            }
        }

        //FILA DEL SUPERIOR CON NÚMEROS 3,6,9,12,15,...
        if (y >= 16 && y <= 74) {
            if (x >= 62 && x <= 102) {
                System.out.println("Apuesta al 3");
                incrementarFichaEnCasillaDelTablero(26);
            } else if (x >= 102 && x <= 145) {
                System.out.println("Apuesta al 6");
                incrementarFichaEnCasillaDelTablero(27);
            } else if (x >= 145 && x <= 185) {
                System.out.println("Apuesta al 9");
                incrementarFichaEnCasillaDelTablero(28);
            } else if (x >= 185 && x <= 229) {
                System.out.println("Apuesta al 12");
                incrementarFichaEnCasillaDelTablero(29);
            } else if (x >= 229 && x <= 270) {
                System.out.println("Apuesta al 15");
                incrementarFichaEnCasillaDelTablero(30);
            } else if (x >= 270 && x <= 312) {
                System.out.println("Apuesta al 18");
                incrementarFichaEnCasillaDelTablero(31);
            } else if (x >= 312 && x <= 354) {
                System.out.println("Apuesta al 21");
                incrementarFichaEnCasillaDelTablero(32);
            } else if (x >= 354 && x <= 396) {
                System.out.println("Apuesta al 24");
                incrementarFichaEnCasillaDelTablero(33);
            } else if (x >= 396 && x <= 438) {
                System.out.println("Apuesta al 27");
                incrementarFichaEnCasillaDelTablero(34);
            } else if (x >= 438 && x <= 480) {
                System.out.println("Apuesta al 30");
                incrementarFichaEnCasillaDelTablero(35);
            } else if (x >= 480 && x <= 521) {
                System.out.println("Apuesta al 33");
                incrementarFichaEnCasillaDelTablero(36);
            } else if (x >= 521 && x <= 564) {
                System.out.println("Apuesta al 36");
                incrementarFichaEnCasillaDelTablero(37);
            }
        }

        //CERO
        if (y >= 15 && y <= 188) {
            if (x >= 0 && x <= 60) {
                System.out.println("Apuesta a la casilla 0");
                incrementarFichaEnCasillaDelTablero(38);
            }
        }

        //PRIMERA FILA DEL TABLERO
        if (y >= 236 && y <= 276) {
            //Todas las casillas rojas 
            if (x >= 230 && x <= 310) {
                System.out.println("Apuesta a la casilla rojo");
                rojas.incrementarFicha();
            } //Todas las casillas negras 
            else if (x >= 314 && x <= 396) {
                System.out.println("Apuesta a la casilla negra");
                negras.incrementarFicha();
            } //Pares
            else if (x >= 146 && x <= 228) {
                pares.incrementarFicha();
                System.out.println("Apuesta a la casilla pares");
            } //Impares
            else if (x >= 397 && x <= 478) {
                impares.incrementarFicha();
                System.out.println("Apuesta a la casilla impares");
            } //1 al 18
            else if (x >= 62 && x <= 146) {
                System.out.println("Apuesta a la casilla 1 al 18");
            } //19 al 36
            else if (x >= 478 && x <= 563) {
                System.out.println("Apuesta a la casilla 19 al 36");
            }
        }
        if (fichas > 0) {
            fichas--;
        } else {
            System.out.println("Se quedó sin fichas!!");
            JOptionPane.showMessageDialog(null, "Se quedó sin fichas!!. Game Over!");
            System.exit(fichas);
        }
    }

    protected void incrementarFichaEnCasillaDelTablero(int posicionCasillaEnTablero) {
        casillas.get(posicionCasillaEnTablero).incrementarFicha();
    }

    private void aniadiendoCasillas() {
        casillas.add(pares);
        casillas.add(impares);
        //Agregando objeto CasillaPleno, para casillas de mi tablero
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
        casillas.add(new CasillaPleno(2, "Negro"));
        casillas.add(new CasillaPleno(5, "Rojo"));
        casillas.add(new CasillaPleno(8, "Negro"));
        casillas.add(new CasillaPleno(11, "Negro"));
        casillas.add(new CasillaPleno(14, "Rojo"));
        casillas.add(new CasillaPleno(17, "Negro"));
        casillas.add(new CasillaPleno(20, "Negro"));
        casillas.add(new CasillaPleno(23, "Rojo"));
        casillas.add(new CasillaPleno(26, "Negro"));
        casillas.add(new CasillaPleno(29, "Negro"));
        casillas.add(new CasillaPleno(32, "Rojo"));
        casillas.add(new CasillaPleno(35, "Negro"));
        casillas.add(new CasillaPleno(3, "Rojo"));
        casillas.add(new CasillaPleno(6, "Negro"));
        casillas.add(new CasillaPleno(9, "Rojo"));
        casillas.add(new CasillaPleno(12, "Rojo"));
        casillas.add(new CasillaPleno(15, "Negro"));
        casillas.add(new CasillaPleno(18, "Rojo"));
        casillas.add(new CasillaPleno(21, "Rojo"));
        casillas.add(new CasillaPleno(24, "Negro"));
        casillas.add(new CasillaPleno(27, "Rojo"));
        casillas.add(new CasillaPleno(30, "Rojo"));
        casillas.add(new CasillaPleno(33, "Negro"));
        casillas.add(new CasillaPleno(36, "Rojo"));
        casillas.add(new CasillaPleno(0, "Verde"));
    }

}
