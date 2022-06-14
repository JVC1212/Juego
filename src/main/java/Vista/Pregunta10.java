
package Vista;

import javax.swing.JOptionPane;

public class Pregunta10 extends javax.swing.JFrame {

    public Pregunta10() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Opcion1 = new javax.swing.JCheckBox();
        Opcion2 = new javax.swing.JCheckBox();
        Opcion3 = new javax.swing.JCheckBox();
        Opcion4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(558, 407));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Nivel 4");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("¿Qué es Herencia en programación?");

        Opcion1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion1.setText("A. Nos permite derivar un nuevo codigo desde otro ya existente");
        Opcion1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion1ItemStateChanged(evt);
            }
        });

        Opcion2.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion2.setText("B. Nos permite derivar una nueva variable de una ya existente");
        Opcion2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion2ItemStateChanged(evt);
            }
        });

        Opcion3.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion3.setText("C. Nos permite derivar una nueva clase de una ya existente");
        Opcion3.setActionCommand("<html>C. Lenguaje para organizar algoritmos y procesos logicos<br/>\nque no permite interactuar al ser humano con la computadora");
        Opcion3.setPreferredSize(new java.awt.Dimension(550, 700));
        Opcion3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion3ItemStateChanged(evt);
            }
        });

        Opcion4.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion4.setText("D. Nos permite derivar una nueva funcion de una ya existente");
        Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion4ActionPerformed(evt);
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
                    .addComponent(Opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(Opcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Opcion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion4ActionPerformed
    if(this.Opcion4.isSelected())
    {    
    this.Opcion1.setEnabled (false);
    this.Opcion2.setEnabled(false);
    this.Opcion3.setEnabled (false);
    }                                           
    else{
     this.Opcion2.setEnabled (true);
    this.Opcion1.setEnabled(true);
    this.Opcion3.setEnabled (true);   
    }
    }//GEN-LAST:event_Opcion4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.Opcion1.isSelected()==false && this.Opcion2.isSelected()==false
                && this.Opcion4.isSelected()==false&& this.Opcion3.isSelected()==false){
            JOptionPane.showMessageDialog(null, "Seleccione una respuesta");                    
                }
            if(this.Opcion3.isSelected()){
                   JOptionPane.showMessageDialog(null, "Correcto");
                    new Pregunta11().setVisible(true);
                    this.setVisible(false);
       }else{JOptionPane.showMessageDialog(null, "Incorrecto");
       
            }
         
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Opcion1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Opcion1ItemStateChanged
    if(this.Opcion1.isSelected())
    {    
    this.Opcion2.setEnabled (false);
    this.Opcion4.setEnabled(false);
    this.Opcion3.setEnabled (false);
    }                                           
    else{
     this.Opcion2.setEnabled (true);
    this.Opcion4.setEnabled(true);
    this.Opcion3.setEnabled (true);   
    }
    }//GEN-LAST:event_Opcion1ItemStateChanged

    private void Opcion2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Opcion2ItemStateChanged
    if(this.Opcion2.isSelected())
    {    
    this.Opcion1.setEnabled (false);
    this.Opcion4.setEnabled(false);
    this.Opcion3.setEnabled (false);
    }                                           
    else{
     this.Opcion1.setEnabled (true);
    this.Opcion4.setEnabled(true);
    this.Opcion3.setEnabled (true);   
    }
    
    }//GEN-LAST:event_Opcion2ItemStateChanged

    private void Opcion3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Opcion3ItemStateChanged
   if(this.Opcion3.isSelected())
    {    
    this.Opcion1.setEnabled (false);
    this.Opcion4.setEnabled(false);
    this.Opcion2.setEnabled (false);
    }                                           
    else{
     this.Opcion1.setEnabled (true);
    this.Opcion4.setEnabled(true);
    this.Opcion2.setEnabled (true);   
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
            java.util.logging.Logger.getLogger(Pregunta10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Opcion1;
    private javax.swing.JCheckBox Opcion2;
    private javax.swing.JCheckBox Opcion3;
    private javax.swing.JCheckBox Opcion4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
