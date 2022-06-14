package Vista;
//Se importan las librerias que se usan en el codigo
import Controlador.Juego;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
//Creacion de la clase de la pregunta, heredada del JFrame
public class Pregunta1 extends javax.swing.JFrame {
//Se define una proiedad de tipo juego con el nombre controlador
    public Juego Controlador;
    //Este es el contructor de la clase pregunta
    public Pregunta1() {
        //Crea todos los componentes visuales
        initComponents();
        //Se crea instancia del controlador Juego
        Controlador = new Juego();
       /*Se llama a la funcion crearinstanciamodelo la cual crea una instancia
        dentro de la clase mensajes*/
        Controlador.crearinstanciamodelo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
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
        jLabel2.setText("¿Que es programación de software?");

        jCheckBox1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jCheckBox1.setText("A. Acción de programar  ");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jCheckBox2.setText("B. Conjunto de programas que se transmiten en radio o televisión ");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        Opcion3.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        Opcion3.setText("<html>C. Conjunto de instrucciones ordenadas que llevan a la computadora<br/> \no dispositivo a ejecutar una tarea especifica</html>");
        Opcion3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Opcion3ItemStateChanged(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jCheckBox4.setText("D.Todas las anteriores");
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
                    .addComponent(Opcion3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /*Condicion donde se valida que no permita seleccionar multiples opciones
      se debe hacer con cada uno de los chexBox*/
    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (this.jCheckBox4.isSelected()) {
            this.jCheckBox1.setEnabled(false);
            this.jCheckBox2.setEnabled(false);
            this.Opcion3.setEnabled(false);
        } else {
            this.jCheckBox2.setEnabled(true);
            this.jCheckBox1.setEnabled(true);
            this.Opcion3.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed
//Creación y configuración del botón
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane optionPane = new JOptionPane("Advertencia");
        //Creación de Dialogo para mostrar advertencias
        JDialog dialog = optionPane.createDialog("");
        //Se crea variable para controlar visualizacion de Dialogo
        boolean abrirmensaje = true;
       //Se valida que ninguna opcion este seleccionada
        if (this.jCheckBox1.isSelected() == false && this.jCheckBox2.isSelected() == false
                && this.jCheckBox4.isSelected() == false && this.Opcion3.isSelected() == false) {
            abrirmensaje = true;
            dialog = optionPane.createDialog(Controlador.mensajeseleccionerespuesta());
            //Se valida que la respuesta correcta se halla seleccionado
        } else if (this.Opcion3.isSelected()) {
            abrirmensaje = false;
        //Si la respuesta seleccionada es correcta, pasara a la siguiente pregunta
            new Pregunta2().setVisible(true);
            //Cierra la ventana anterior
            this.setVisible(false);
            //Configuracion de mensaje cuando la respuesta es incorrecta
        } else {
            dialog = optionPane.createDialog(Controlador.mensajeincorrecto());
            abrirmensaje = true;
        }
        //Se pconfigura el Dialogo para que aparezca sobre otras ventanas
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(abrirmensaje);


    }//GEN-LAST:event_jButton1ActionPerformed
    /*Condicion donde se valida que no permita seleccionar multiples opciones
      se debe hacer con cada uno de los chexBox  */
    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (this.jCheckBox1.isSelected()) {
            this.jCheckBox2.setEnabled(false);
            this.jCheckBox4.setEnabled(false);
            this.Opcion3.setEnabled(false);
        } else {
            this.jCheckBox2.setEnabled(true);
            this.jCheckBox4.setEnabled(true);
            this.Opcion3.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged
    /*Condicion donde se valida que no permita seleccionar multiples opciones
      se debe hacer con cada uno de los chexBox*/
    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (this.jCheckBox2.isSelected()) {
            this.jCheckBox1.setEnabled(false);
            this.jCheckBox4.setEnabled(false);
            this.Opcion3.setEnabled(false);
        } else {
            this.jCheckBox1.setEnabled(true);
            this.jCheckBox4.setEnabled(true);
            this.Opcion3.setEnabled(true);
        }

    }//GEN-LAST:event_jCheckBox2ItemStateChanged
    /*Condicion donde se valida que no permita seleccionar multiples opciones
      se debe hacer con cada uno de los chexBox*/
    private void Opcion3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Opcion3ItemStateChanged
        if (this.Opcion3.isSelected()) {
            this.jCheckBox1.setEnabled(false);
            this.jCheckBox4.setEnabled(false);
            this.jCheckBox2.setEnabled(false);
        } else {
            this.jCheckBox1.setEnabled(true);
            this.jCheckBox4.setEnabled(true);
            this.jCheckBox2.setEnabled(true);
        }
    }//GEN-LAST:event_Opcion3ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta1().setVisible(true);
            }
        });
    }
//Propiedades de las clases tipo Button y ChexBox
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Opcion3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
