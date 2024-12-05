package Modelo;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    public void con(JLabel j,JLabel panel, JButton bt) {
        if(batalla[0][0]=='s'){
            JOptionPane.showMessageDialog(null, "BARCO HUNDIDO");
            int ja =Integer.parseInt(j.getText());
            ja=ja+1;
            j.setText(""+ja);
            bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modelo/Explosion.jpeg")));
            panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modelo/Mar.jpeg")));
        }
    }

    
    
}