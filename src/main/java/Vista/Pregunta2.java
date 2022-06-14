
package Vista;

import javax.swing.JOptionPane;


public class Pregunta2 extends javax.swing.JFrame {

   
    public Pregunta2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Opcion1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        Opcion3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Nivel 1");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("¿Qué es un software de programación?");

        Opcion1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion1.setText("A.  Son herramientas que se usan para la elaboración de programas");
        Opcion1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion1ItemStateChanged(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jCheckBox2.setText("B. Son herramientas para el paquete de Office");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        Opcion3.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion3.setText("C. Es un antivirus para la protección de la computadora");
        Opcion3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion3ItemStateChanged(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jCheckBox4.setText("D. Todas las anteriores");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Opcion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Opcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Opcion3)
                .addGap(13, 13, 13)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
    if(this.jCheckBox4.isSelected())
    {    
    this.Opcion1.setEnabled (false);
    this.jCheckBox2.setEnabled(false);
    this.Opcion3.setEnabled (false);
    }                                           
    else{
     this.jCheckBox2.setEnabled (true);
    this.Opcion1.setEnabled(true);
    this.Opcion3.setEnabled (true);   
    }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.Opcion1.isSelected()==false && this.jCheckBox2.isSelected()==false
                && this.jCheckBox4.isSelected()==false&& this.Opcion3.isSelected()==false){
            JOptionPane.showMessageDialog(null, "Seleccione una respuesta");                    
                }
            if(this.Opcion1.isSelected()){
                   JOptionPane.showMessageDialog(null, "Correcto");
                    new Pregunta3().setVisible(true);
                    this.setVisible(false);
       }else{JOptionPane.showMessageDialog(null, "Incorrecto");
       
            }
         
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Opcion1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Opcion1ItemStateChanged
    if(this.Opcion1.isSelected())
    {    
    this.jCheckBox2.setEnabled (false);
    this.jCheckBox4.setEnabled(false);
    this.Opcion3.setEnabled (false);
    }                                           
    else{
     this.jCheckBox2.setEnabled (true);
    this.jCheckBox4.setEnabled(true);
    this.Opcion3.setEnabled (true);   
    }
    }//GEN-LAST:event_Opcion1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
    if(this.jCheckBox2.isSelected())
    {    
    this.Opcion1.setEnabled (false);
    this.jCheckBox4.setEnabled(false);
    this.Opcion3.setEnabled (false);
    }                                           
    else{
     this.Opcion1.setEnabled (true);
    this.jCheckBox4.setEnabled(true);
    this.Opcion3.setEnabled (true);   
    }
    
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void Opcion3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Opcion3ItemStateChanged
   if(this.Opcion3.isSelected())
    {    
    this.Opcion1.setEnabled (false);
    this.jCheckBox4.setEnabled(false);
    this.jCheckBox2.setEnabled (false);
    }                                           
    else{
     this.Opcion1.setEnabled (true);
    this.jCheckBox4.setEnabled(true);
    this.jCheckBox2.setEnabled (true);   
    }
    }//GEN-LAST:event_Opcion3ItemStateChanged
          
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Opcion1;
    private javax.swing.JCheckBox Opcion3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
