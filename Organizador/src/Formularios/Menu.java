package Formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        //rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "C:\\Users\\Emerson\\Documents\\NetBeansProjects\\ProyectoDefinitivo\\src\\Imagenes\\23.jpg");        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        listaTablero = new javax.swing.JLabel();
        txtnuevoTablero = new javax.swing.JLabel();
        nameMenu1 = new javax.swing.JLabel();
        btnLisTa = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaTablero.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        listaTablero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listaTablero.setText("LISTA DE TABLEROS");
        FondoPanel.add(listaTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 286, -1));

        txtnuevoTablero.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtnuevoTablero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnuevoTablero.setText("TABLERO");
        FondoPanel.add(txtnuevoTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 250, -1));

        nameMenu1.setFont(new java.awt.Font("Roboto Thin", 0, 48)); // NOI18N
        nameMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameMenu1.setText("MENU PRINCIPAL");
        FondoPanel.add(nameMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 594, -1));

        btnLisTa.setText("+");
        btnLisTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLisTaActionPerformed(evt);
            }
        });
        FondoPanel.add(btnLisTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 70, 30));

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        FondoPanel.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        Btn_Salir.setText("SALIR");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        FondoPanel.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLisTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLisTaActionPerformed
         // listado
        FrmListarTableros frm = new FrmListarTableros();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLisTaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         //bnt Nuevo Tablero
        FrmAgregarTablero frm = new FrmAgregarTablero();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
         int confirmado = JOptionPane.showConfirmDialog(null, "Desea salir del programa organizador de tareas");
        if (JOptionPane.OK_OPTION==confirmado){
            System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JButton btnLisTa;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel listaTablero;
    private javax.swing.JLabel nameMenu1;
    private javax.swing.JLabel txtnuevoTablero;
    // End of variables declaration//GEN-END:variables
}
