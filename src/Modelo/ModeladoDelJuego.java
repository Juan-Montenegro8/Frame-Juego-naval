package Modelo;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN JOSE
 */
public class ModeladoDelJuego {
    
    Random aleatorio=new Random();
     char batalla[][]= new char[7][7];
     
    public void ubicar() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                batalla[i][j] = 'n'; // 'n' indica que no hay barco
            }
        }
    
        // Ubica un barco en cada fila
        for (int i = 0; i < 7; i++) {
            int columna = aleatorio.nextInt(7);
            while (batalla[i][columna] == 's') { // Evita duplicados
                columna = aleatorio.nextInt(7);
            }
            batalla[i][columna] = 's'; // 's' indica un barco
        }
        
        
    }
    public void contadorHundidos(JLabel lblcontador,JLabel panel, JButton btnexplocion, int fila, int columna) {
        if (batalla[fila][columna] == 's') {
            JOptionPane.showMessageDialog(null, "BARCO HUNDIDO");
            int contador = Integer.parseInt(lblcontador.getText());
            contador ++;
            lblcontador.setText("" + contador);
            btnexplocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modelo/Explosion.jpeg")));
            panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modelo/Mar.jpeg")));
    
            // Marca la posición como atacada para evitar hundir el mismo barco dos veces
            batalla[fila][columna] = 'x'; // 'x' indica posición atacada
        } else {
            JOptionPane.showMessageDialog(null, "Agua. Sigue intentando.");
        }
    }

    
    
}