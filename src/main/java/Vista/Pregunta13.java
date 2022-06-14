
package Vista;
//Se importan las librerias que se usan en el codigo
import Controlador.Juego;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
//Creacion de la clase de la pregunta, heredada del JFram
public class Pregunta13 extends javax.swing.JFrame {
//Se define una proiedad de tipo juego con el nombre controlador
    public Juego Controlador;
    //Este es el contructor de la clase pregunta
    public Pregunta13() {
    //Crea todos los componentes visuales
        initComponents();
        //Se crea instancia del controlador Juego
        Controlador = new Juego();
       /*Se llama a la funcion crearinstanciamodelo la cual crea una instancia
        dentro de la clase mensajes*/
        Controlador.crearinstanciamodelo();
        try {
URL url = new URL("https://lh5.googleusercontent.com/W8dmHZ6xD5pbNm8sww9iTEDsa8dLdv6LwathpGMSPt7CtetRTX82Eesib2BDgY3M-m1Hbmk7RDrI7fBmZIPsT3IITl-1yQrR1pkJdHZNhiXG9lS-QpA");
BufferedImage myPicture = ImageIO.read(url);
ImageIcon img = new ImageIcon(myPicture);
this.Imagenn.setIcon(img);
} catch (IOException ex) {
Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
}
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
        Imagenn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Nivel 4");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("<html>La siguiente imágen pertenecer al tipo <br/> de programación:");

        Opcion1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion1.setText("A. Declarativa");
        Opcion1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion1ItemStateChanged(evt);
            }
        });

        Opcion2.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion2.setText("B. Imperativa");
        Opcion2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion2ItemStateChanged(evt);
            }
        });

        Opcion3.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion3.setText("C. Orientada a objetos");
        Opcion3.setActionCommand("<html>C. Lenguaje para organizar algoritmos y procesos logicos<br/>\nque no permite interactuar al ser humano con la computadora");
        Opcion3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion3ItemStateChanged(evt);
            }
        });

        Opcion4.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion4.setText("D. Orientada a eventos");
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
                    .addComponent(Opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jButton1))
                            .addComponent(Imagenn, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 89, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagenn, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(Opcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Opcion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Opcion3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Opcion4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*Condicion donde se valida que no permita seleccionar multiples opciones
      se debe hacer con cada uno de los chexBox*/
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
//Creación y configuración del botón
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane optionPane = new JOptionPane("Advertencia");
        //Creación de Dialogo para mostrar advertencias
        JDialog dialog = optionPane.createDialog("");
        //Se crea variable para controlar visualizacion de Dialogo
        boolean abrirmensaje = true;
        //Se valida que ninguna opcion este seleccionada
        if(this.Opcion1.isSelected()==false && this.Opcion2.isSelected()==false
                && this.Opcion4.isSelected()==false&& this.Opcion3.isSelected()==false){
            abrirmensaje = true;
            dialog = optionPane.createDialog(Controlador.mensajeseleccionerespuesta());
            //Se valida que la respuesta correcta se halla seleccionado                    
                }
        else if(this.Opcion3.isSelected()){
            abrirmensaje = false;
                    //Si la respuesta seleccionada es correcta, pasara a la siguiente pregunta
            new Pregunta14().setVisible(true);
            //Cierra la ventana anterior
            this.setVisible(false);
       //Configuracion de mensaje cuando la respuesta es incorrecta
       }else{
            dialog = optionPane.createDialog(Controlador.mensajeincorrecto());
         abrirmensaje = true;
            }
         //Se pconfigura el Dialogo para que aparezca sobre otras ventanas
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(abrirmensaje);
       
       
        
    }//GEN-LAST:event_jButton1ActionPerformed
/*Condicion donde se valida que no permita seleccionar multiples opciones
      se debe hacer con cada uno de los chexBox*/
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
/*Condicion donde se valida que no permita seleccionar multiples opciones
      se debe hacer con cada uno de los chexBox*/
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
/*Condicion donde se valida que no permita seleccionar multiples opciones
      se debe hacer con cada uno de los chexBox*/
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
            java.util.logging.Logger.getLogger(Pregunta13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta13().setVisible(true);
            }
        });
    }
//Propiedades de las clases tipo Button y ChexBox
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagenn;
    private javax.swing.JCheckBox Opcion1;
    private javax.swing.JCheckBox Opcion2;
    private javax.swing.JCheckBox Opcion3;
    private javax.swing.JCheckBox Opcion4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
