package Formularios;


import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class FrmAgregarListadoTareas extends javax.swing.JFrame {

    /**
     * Creates new form FrmAgregarAlumno
     */
    public FrmAgregarListadoTareas() {
        initComponents();
        setLocationRelativeTo(this);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtNoLITa = new javax.swing.JTextField();
        btnAgregarLisAc = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre Lista de Tareas :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 160, 30));

        txtNoLITa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNoLITa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoLITaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNoLITa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 224, 30));

        btnAgregarLisAc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregarLisAc.setText("Agregar lista de tareas");
        btnAgregarLisAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLisAcActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarLisAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 190, 30));

        Regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 100, 30));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE TAREAS");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 230, 20));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.setVisible(false);
        Tablero frm = new Tablero();
        frm.setVisible(true);        
    }//GEN-LAST:event_RegresarActionPerformed
    
    /**
     * Método que agrega un alumno a la lista de Alumnos
     * @param evt 
     */
    private void btnAgregarLisAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLisAcActionPerformed
        UUID uuid = UUID.randomUUID();
        String idTablero = uuid.toString();
        String nombre = txtNoLITa.getText().trim().replaceAll("\\s*\\|\\s*", " pipe operator ");
        String id = EstadoGlobal.TransferenciaTablero.getIdentificacion();
        try {    
            if (!nombre.isEmpty() && !nombre.isBlank() && nombre.length() >= 0) {
                ArrayList<ListadoTareas> lista = new ArrayList();
                ListadoTareas listadoTareas = new ListadoTareas();         
                listadoTareas.setIdListadoTareas(idTablero);
                listadoTareas.setIdTableroTareas(id);
                listadoTareas.setNombreListado(nombre);
                lista.add(listadoTareas);
                EstadoGlobal.TransferenciaTablero.aniadirTareasTablero(lista);
                JOptionPane.showMessageDialog(null, "Tarea Agregada Correctamente!");
                txtNoLITa.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "No Puede Dejar El Nombre Vacio!");
                 txtNoLITa.setText("");
            }
        }catch (NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error! " + ex);
             txtNoLITa.setText("");
        }    
    }//GEN-LAST:event_btnAgregarLisAcActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
     // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void txtNoLITaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoLITaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoLITaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgregarListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarListadoTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JButton btnAgregarLisAc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNoLITa;
    // End of variables declaration//GEN-END:variables
}
