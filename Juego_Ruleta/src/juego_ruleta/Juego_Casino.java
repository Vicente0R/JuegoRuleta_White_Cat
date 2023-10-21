/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_ruleta;

/**
 *
 * @author Stefan2
 */
public interface Juego_Casino {
    /**
     *
     * @param x
     * @param y
     */
    public void calcularValorApuesta(int x, int y);
    /**
     * @return the fichas
     */
    public int getFichas();
    /**
     * @param fichas the fichas to set
     */
    public void setFichas(int fichas);
    
    public void mostrarApuestaRealizada();

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaRuleta window = new VentanaRuleta();
        window.setVisible(true);
        // TODO code application logic here
    }

}
