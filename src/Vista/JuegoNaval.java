package Vista;
import Modelo.ModeladoDelJuego;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class JuegoNaval extends javax.swing.JFrame {

    ModeladoDelJuego modelado;
    public JuegoNaval() {
        initComponents();
        modelado = new ModeladoDelJuego();
        modelado.ubicar();
    }

    private JButton[][] botones = new JButton[7][7];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBatallaNaval = new javax.swing.JLabel();
        lblmisiles = new javax.swing.JLabel();
        lblMisilesCon = new javax.swing.JLabel();
        lblBarcosDerrivados = new javax.swing.JLabel();
        lblbarcocontador = new javax.swing.JLabel();
        pap = new javax.swing.JPanel();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn65 = new javax.swing.JButton();
        btn66 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblbarcoHundido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblBatallaNaval.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lblBatallaNaval.setForeground(new java.awt.Color(255, 255, 255));
        lblBatallaNaval.setText("Batalla Naval");

        lblmisiles.setForeground(new java.awt.Color(255, 255, 255));
        lblmisiles.setText("Misiles");

        lblMisilesCon.setForeground(new java.awt.Color(255, 255, 255));
        lblMisilesCon.setText("35");

        lblBarcosDerrivados.setForeground(new java.awt.Color(255, 255, 255));
        lblBarcosDerrivados.setText("barcos derrivados");

        lblbarcocontador.setForeground(new java.awt.Color(255, 255, 255));
        lblbarcocontador.setText("0");

        pap.setLayout(new java.awt.GridLayout(7, 7, 4, 4));

        configurarboton(btn00, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn01, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn02, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn03, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn04, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn05, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn06, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn10, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn11, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn12, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn13, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn14, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn15, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn16, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn20, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn21, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn22, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn23, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn24, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn25, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn26, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn30, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn31, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn32, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn33, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn34, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn35, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn36, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn40, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn41, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn42, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn43, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn44, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn45, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn46, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn50, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn51, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn52, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn53, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn54, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn55, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn56, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn60, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn61, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn62, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn63, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn64, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn65, " ", evt -> btn00ActionPerformed(evt), pap);
        configurarboton(btn66, " ", evt -> btn00ActionPerformed(evt), pap);

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        lblbarcoHundido.setBackground(new java.awt.Color(0, 255, 204));
        lblbarcoHundido.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbarcoHundido, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbarcoHundido, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblBarcosDerrivados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblmisiles, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMisilesCon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblbarcocontador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lblBatallaNaval, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBatallaNaval)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmisiles)
                    .addComponent(lblMisilesCon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarcosDerrivados)
                    .addComponent(lblbarcocontador))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        MecanicaJuego(btn00,0,0);
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        MecanicaJuego(btn01,0,1);
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        MecanicaJuego(btn02,0,2);
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        MecanicaJuego(btn03,0,3);
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed
        MecanicaJuego(btn04,0,4);
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn05ActionPerformed
        MecanicaJuego(btn05,0,5);
    }//GEN-LAST:event_btn05ActionPerformed

    private void btn06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn06ActionPerformed
        MecanicaJuego(btn06,0,6);
    }//GEN-LAST:event_btn06ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        MecanicaJuego(btn10,1,0);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        MecanicaJuego(btn11,1,1);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        MecanicaJuego(btn12,1,2);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        MecanicaJuego(btn13,1,3);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        MecanicaJuego(btn14,1,4);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        MecanicaJuego(btn15,1,5);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        MecanicaJuego(btn16,1,6);
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        MecanicaJuego(btn20,2,0);
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        MecanicaJuego(btn21,2,1);
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        MecanicaJuego(btn22,2,2);
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        MecanicaJuego(btn23,2,3);
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        MecanicaJuego(btn24,2,4);
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        MecanicaJuego(btn25,2,5);
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        MecanicaJuego(btn26,2,6);
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        MecanicaJuego(btn30,3,0);
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        MecanicaJuego(btn31,3,1);
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        MecanicaJuego(btn32,3,2);
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        MecanicaJuego(btn33,3,3);
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        MecanicaJuego(btn34,3,4);
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        MecanicaJuego(btn35,3,5);
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        MecanicaJuego(btn36,3,6);
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        MecanicaJuego(btn40,4,0);
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        MecanicaJuego(btn41,4,1);
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        MecanicaJuego(btn42,4,2);
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        MecanicaJuego(btn43,4,3);
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        MecanicaJuego(btn44,4,4);
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        MecanicaJuego(btn45,4,5);
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        MecanicaJuego(btn46,4,6);
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        MecanicaJuego(btn50,5,0);
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        MecanicaJuego(btn51,5,1);
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52ActionPerformed
        MecanicaJuego(btn52,5,2);
    }//GEN-LAST:event_btn52ActionPerformed

    private void btn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn53ActionPerformed
        MecanicaJuego(btn53,5,3);
    }//GEN-LAST:event_btn53ActionPerformed

    private void btn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn54ActionPerformed
        MecanicaJuego(btn54,5,4);
    }//GEN-LAST:event_btn54ActionPerformed

    private void btn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn55ActionPerformed
        MecanicaJuego(btn55,5,5);
    }//GEN-LAST:event_btn55ActionPerformed

    private void btn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn56ActionPerformed
        MecanicaJuego(btn56,5,6);
    }//GEN-LAST:event_btn56ActionPerformed

    private void btn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn60ActionPerformed
        MecanicaJuego(btn60,6,0);
    }//GEN-LAST:event_btn60ActionPerformed

    private void btn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn61ActionPerformed
        MecanicaJuego(btn61,6,1);
    }//GEN-LAST:event_btn61ActionPerformed

    private void btn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn62ActionPerformed
        MecanicaJuego(btn62,6,2);
    }//GEN-LAST:event_btn62ActionPerformed

    private void btn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn63ActionPerformed
        MecanicaJuego(btn63,6,3);
    }//GEN-LAST:event_btn63ActionPerformed

    private void btn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn64ActionPerformed
        MecanicaJuego(btn64,6,4);
    }//GEN-LAST:event_btn64ActionPerformed

    private void btn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn65ActionPerformed
        MecanicaJuego(btn65,6,5);
    }//GEN-LAST:event_btn65ActionPerformed

    private void btn66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn66ActionPerformed
        MecanicaJuego(btn66,6,6);
    }//GEN-LAST:event_btn66ActionPerformed

    
    public void MecanicaJuego (JButton btnposicion, int fila, int columna){
        
        btnposicion.setEnabled(false);
        int contadormisiles=Integer.parseInt(lblMisilesCon.getText());
        
        contadormisiles--;
        lblMisilesCon.setText(""+contadormisiles);
        modelado.contadorHundidos(lblbarcocontador,lblbarcoHundido,btnposicion,fila,columna);
        if(contadormisiles==30){
            JOptionPane.showMessageDialog(null, "FIN DEL JUGIO"
                    + "\n hundiste "+lblbarcocontador.getText()+" barcos");
            System.exit(0);
        }
         
    }
    
    public void configurarboton(JButton boton, String texto, ActionListener action, JPanel contenedor){
        boton.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // Configura la fuente
        boton.setText(texto); // Configura el texto del botón
        boton.addActionListener(action); // Asocia la acción
        contenedor.add(boton); 
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoNaval().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblbarcocontador;
    private javax.swing.JLabel lblMisilesCon;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn65;
    private javax.swing.JButton btn66;
    private javax.swing.JLabel lblBatallaNaval;
    private javax.swing.JLabel lblmisiles;
    private javax.swing.JLabel lblBarcosDerrivados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblbarcoHundido;
    private javax.swing.JPanel pap;
    // End of variables declaration//GEN-END:variables
}