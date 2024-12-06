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
            batalla[i][aleatorio.nextInt(7)]='s';
        }
        
        
    }
    public void con(JLabel lblcontador,JLabel panel, JButton btnexplocion) {
        if(batalla[0][0]=='s'){
            JOptionPane.showMessageDialog(null, "BARCO HUNDIDO");
            int contador =Integer.parseInt(lblcontador.getText());
            contador+=1;
            lblcontador.setText(""+contador);
            btnexplocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modelo/Explosion.jpeg")));
            panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modelo/Mar.jpeg")));
        }
    }

    
    
}